def translate(x: Any) = x match {
  case _ => "Something strange I don't know :-("
}

// ----------------------------------------------------------

def translate(x: Any) = x match {
  case "Hi" => "A casual greeting."
  case _ => "Something strange I don't know :-("
}

// ----------------------------------------------------------

def translate(x: Any) = x match {
  case "Hi" => "A casual greeting."
  case s: String => "An unknown String: " + s
  case _ => "Something strange I don't know :-("
}

// ----------------------------------------------------------

def translate(x: Any) = x match {
  case Cage(animal) => "A cage for a " + animal
  case "Hi" => "A casual greeting."
  case s: String => "An unknown String: " + s
  case _ => "Something strange I don't know :-("
}

// ----------------------------------------------------------

def translate(x: Any) = x match {
  case 1 :: 2 :: 3 :: Nil => "One two three"
  case Cage(animal) => "A cage for a " + animal
  case "Hi" => "A casual greeting."
  case s: String => "An unknown String: " + s
  case _ => "Something strange I don't know :-("
}
