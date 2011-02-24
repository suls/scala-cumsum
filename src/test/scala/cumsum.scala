import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers


class CumsumSpec extends FlatSpec with ShouldMatchers {

  "cum" should "sum up" in {
      Cumsum( 1 :: 2 :: Nil) should equal ( 1 :: 3 :: Nil)
  }
  val l = 1 to 1000000
  
  "cum seq" should "sum up slower" in {
    import Profiling._
    
    timed(printTime("summing ")){
       Cumsum( l )
    }
     timed(printTime("summing ")){
          Cumsum( l )
       }
     timed(printTime("summing ")){
             Cumsum( l )
          }
     timed(printTime("summing ")){
                Cumsum( l )
             }
     timed(printTime("summing ")){
                   Cumsum( l )
                }
    //data should equal ( 1 :: 3 :: Nil)
  }
  
  "cum par" should "sum up faster" in {
    import Profiling._
    val lp = l.par
   timed(printTime("summing par ")){
       Cumsum( lp )
    }
    timed(printTime("summing par ")){
          Cumsum( lp )
       }
    timed(printTime("summing par ")){
             Cumsum( lp )
          }
    timed(printTime("summing par ")){
                Cumsum( lp )
             }
    timed(printTime("summing par ")){
                   Cumsum( lp )
                }
    //data should equal ( 1 :: 3 :: Nil)
  }
}
