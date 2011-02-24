import scala.annotation.tailrec

object Cumsum {
        
  def apply(xs : Seq[Int]) : Seq[Int] = 
    xs.scanLeft(0)(_ + _).tail
}
