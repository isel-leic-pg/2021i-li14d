import pt.isel.canvas.*
import pt.isel.canvas.Canvas
import pt.isel.canvas.WHITE

const val RADIUS : Int = 7

data class Ball(val px : Int, val py : Int, val vx :Int, val vy :Int, val color : Int = WHITE)

fun Ball.step(maxWidth: Int, maxHeigth: Int) :Ball? =
    //alterar para usar intervalo
    when{
        px + RADIUS > maxWidth -> Ball(px - vx , this.py, -this.vx,  this.vy ,this.color)
        this.px - RADIUS < 0 -> Ball(this.px -this.vx, this.py, -this.vx , this.vy, this.color)
        this.py  - RADIUS < 0 -> Ball(this.px, this.py -this.vy, this.vx , -this.vy, this.color)
        this.vy > 0 && this.py > maxHeigth + RADIUS -> null
        else -> Ball(this.px + this.vx, this.py +this.vy, this.vx, this.vy,  this.color)
    }

fun Canvas.drawBall(b : Ball){
    this.drawCircle(b.px, b.py, RADIUS, b.color)
}

fun main() {
    onStart {
        val cv : Canvas = Canvas(1024, 768, BLACK)

        //Criar lista com duas bolas e guardar na variavel balls
        var balls : List<Ball> = emptyList() //listof()

        //Desenhar todas as bolas que estão na lista - foreach
        balls.forEach {b -> cv.drawBall(b)}

        cv.onTimeProgress(10){

            //Percorrer a lista, chamar o step para cada bola e guardar as novas bolas numa nova lista

            balls = balls.mapNotNull({b -> b.step(cv.width, cv.height)})

            cv.erase()
            balls.forEach( {b: Ball -> cv.drawBall(b)} )
        }

        cv.onKeyPressed { k ->
            //Adicionar uma nova bola
            //balls = balls + Ball(RADIUS, (100..500).random(),3, (-6..6).random())
            println(balls.size)
            balls = balls + Ball(RADIUS, (100..500).random(),5, (-6..6).random())
            if(k.code == ESCAPE_CODE)
                cv.close()
        }

    }
    onFinish {
        // ...
    }
}
