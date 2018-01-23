import play.api.libs.json._
import play.api.libs.json.util._
import play.api.libs.json.Writes._

case class Target(
  name: String,
  seq : (String, Seq[String])
)

// implicit val writesNonEmptySeq: Writes[(String, Seq[String])}
