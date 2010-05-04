// 4.1 ----------------------------------------------------------

case class Cage[A](animal: A)

/*
val cage = Cage(new Bird("Bill"))                                 
val cage = Cage(Person("Heiko"))
*/

// 4.2 ----------------------------------------------------------

case class Cage[A <: Animal](animal: A)

// 4.3 ----------------------------------------------------------

case class Cage[+A <: Animal](animal: A)
/*
def operationFreedom(cage: Cage[Animal]) = cage.animal
*/
