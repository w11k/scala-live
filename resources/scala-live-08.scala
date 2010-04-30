val xml = <scala></scala>

// ----------------------------------------------------------

val xml = <scala><xml-support value="Great"/></scala>

// ----------------------------------------------------------

val value = "Great"
val xml = <scala><xml-support value={ value }/></scala>

// ----------------------------------------------------------

xml \ "xml-support"

// ----------------------------------------------------------

xml \ "xml-support" \ "@value"
