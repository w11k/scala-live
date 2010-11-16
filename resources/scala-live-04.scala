// 2.1 ----------------------------------------------------------

val numbers = Seq(1, 2, 3, 4)
val persons = List(Person("Angela", "Merkel"), Person("Silvio", "Berlusconi"), Person("Barak", "Obama"))
Seq.apply(1, 2)

numbers :+ 5
numbers.:+(5)
0 +: numbers
numbers.+:(0)
numbers ++ persons

numbers filter { x => x > 2 }

numbers map { x => x + 1 }
numbers map { x => x + 1 } filter { x => x % 2 == 0 }
persons map { p => p.name.toLowerCase }
persons map { p => p.firstName.size }

persons sortWith { (p1, p2) => p1.firstName <= p2.firstName }

val plusOne = (x: Int) => x + 1
numbers map plusOne

def abc(p1: Person, p2: Person) = p1.firstName <= p2.firstName
persons sortWith abc
