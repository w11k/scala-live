// 2.1 ----------------------------------------------------------

val numbers = Seq(1, 2, 3, 4)
val languages = List("Scala", "Java", "Clojure")
Seq.apply(1, 2)

numbers.:+(5)
numbers :+ 5
numbers.+:(0)
0 +: numbers
numbers ++ languages

numbers.filter(x => x > 2)
numbers filter { x => x > 2 }
numbers filter { _ > 2 }

numbers map { x => x + 1 }
numbers map { _ + 1 } filter { _ % 2 == 0 }
languages map { s => s.toLowerCase }
languages map { s => s.length }

languages flatMap { _.toLowerCase }
languages flatMap { _.toLowerCase } sortWith { (s1, s2) => s1 < s2 }
languages flatMap { _.toLowerCase } sortWith { _ < _ }
languages flatMap { _.toLowerCase } sortWith { _ < _ } distinct

val plusOne = (x: Int) => x + 1
numbers map plusOne

def abc(s1: String, s2: String) = s1 < s2
abc _
languages sortWith abc
