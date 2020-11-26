import pt.isel.canvas.*

const val RADIUS : Int = 15

fun main() {
    onStart {
        val cv : Canvas = Canvas(1024, 768, BLACK)

        //Criar lista com duas bolas e guardar na variavel balls
        var balls : List<Ball> = listOf(Ball(RADIUS, cv.height/2, 10), Ball(RADIUS, RADIUS, 10))

        //Desenhar todas as bolas que estão na lista - foreach
       /* fun callDrawBall(b: Ball){
            cv.drawBall(b)
        }
        balls.forEach(::callDrawBall)*/
        balls.forEach( {b: Ball -> cv.drawBall(b)} )


        cv.onTimeProgress(50){

            //Percorrer a lista, chamar o step para cada bola e guardar as novas bolas numa nova lista
            fun callBallStep(b :Ball) : Ball {
                return b.step(cv.width)
            }
            balls = balls.map(::callBallStep)

            cv.erase()
            //Desenhar todas as bolas que estão na lista - foreach
            //balls.forEach(::callDrawBall)
            balls.forEach( {b: Ball -> cv.drawBall(b)} )
        }

        cv.onKeyPressed { k ->
            //Adicionar uma nova bola
            balls = balls + Ball(RADIUS, (100..1000).random(), 10)
            if(k.code == ESCAPE_CODE)
                cv.close()
        }

    }
    onFinish {
        // ...
    }
}


