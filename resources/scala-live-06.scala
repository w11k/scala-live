class Cage[A]

// ----------------------------------------------------------

class Cage[A <: Animal](val animal: A) extends Cage[A]

// ----------------------------------------------------------

class Cage[+A <: Animal](val animal: A) extends Cage[A]
