import math.{ sqrt, pow }
object Case_class_Assignment extends App{
  val p1= Point(2,5)
  val p2= Point(1,3)
  val p3=p1.move(3,4)

  println(p1)
  println(p2)
  println(p1==p3)
  println("--------------------------------------------")
  println("Q1) Addition of two points")
  println(p1+p2)
  println("--------------------------------------------")
  println("Q2) Moving a point : ")
  println(p3)
  println("--------------------------------------------")
  println("Q3) Calculate the distance")
  println(p1 distance p2)
  println("--------------------------------------------")
  println("Q4) Invert a given point")
  println(p1.Invert())
}

case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  //Method for adding two points
  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
  //Methid for move a point by a given distance dx and dy
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  //Method for calculate the distance between two given points
  def distance(other: Point): Double = sqrt(pow(x - other.x, 2) + pow(y - other.y, 2))
  //Method for invert a given point
  def Invert() = new Point(this.y,this.x)

}

