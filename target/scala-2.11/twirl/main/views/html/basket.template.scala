
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object basket_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class basket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("basket")/*4.16*/ {_display_(Seq[Any](format.raw/*4.18*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->

  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object basket extends basket_Scope0.basket
              /*
                  -- GENERATED --
                  DATE: Fri Nov 18 11:08:57 GMT 2016
                  SOURCE: /home/wdd/webapps/CA2/playLab_CRUD-part1/app/views/basket.scala.html
                  HASH: baa4af7abd388dd10b4f799da7c92548c982c2d3
                  MATRIX: 829->2|889->35|917->36|963->55|991->56|1019->57|1066->79|1088->93|1127->95|1156->98
                  LINES: 32->3|32->3|32->3|32->3|32->3|32->3|33->4|33->4|33->4|34->5
                  -- GENERATED --
              */
          