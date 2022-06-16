def memoize[K, V](f: K => V): K => V = {
  val cache = scala.collection.mutable.Map.empty[K, V]
  k => cache.getOrElseUpdate(k, f(k))
}

val fibona: Int => BigInt = memoize(n => n match {
  case 0 => 0
  case 1 => 1
  case 2 => 1
  case _ => fibona(n-3) + fibona(n-2) + fibona(n-1)
})
def fiboResu(n: Int):Unit = {
   for (i <-0 to (n-1)){
     System.out.print(fibona(i))
     System.out.print(" ")
   }
  }
  
  def main(args:Array[String]):Unit = {
    println("Introduce la cantidad de numeros que deseas de la secuencia de fibonacci: ")
    val n = scala.io.StdIn.readInt()
    print(fiboResu(n))
  } 