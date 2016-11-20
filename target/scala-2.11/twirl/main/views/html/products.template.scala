
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products")/*4.18*/ {_display_(Seq[Any](format.raw/*4.20*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
        <div class="well">
          <h4>Categories</h4>
        </div>
      </div>
      <div class="col-sm-10">
        <table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
					"""),_display_(/*27.7*/for(p <- products) yield /*27.25*/ {_display_(Seq[Any](format.raw/*27.27*/("""
					"""),format.raw/*28.6*/("""<tr>
              <td>"""),_display_(/*29.20*/p/*29.21*/.getId),format.raw/*29.27*/("""</td>
              <td>"""),_display_(/*30.20*/p/*30.21*/.getName),format.raw/*30.29*/("""</td>
              <td>"""),_display_(/*31.20*/p/*31.21*/.getDescription),format.raw/*31.36*/("""</td>
              <td>"""),_display_(/*32.20*/p/*32.21*/.getStock),format.raw/*32.30*/("""</td>
              <td>&euro; """),_display_(/*33.27*/("%.2f".format(p.getPrice))),format.raw/*33.54*/("""</td>
					</tr>
					""")))}),format.raw/*35.7*/(""" """),format.raw/*35.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
      </div>
  </div>
  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Fri Nov 18 10:15:55 GMT 2016
                  SOURCE: /home/wdd/webapps/CA2/playLab_CRUD-part1/app/views/products.scala.html
                  HASH: 4862e85c6cc766b0c10462022be642fe18dc970b
                  MATRIX: 765->1|892->33|920->35|980->68|1008->69|1054->88|1082->89|1110->90|1157->112|1181->128|1220->130|1249->133|1918->776|1952->794|1992->796|2025->802|2076->826|2086->827|2113->833|2165->858|2175->859|2204->867|2256->892|2266->893|2302->908|2354->933|2364->934|2394->943|2453->975|2501->1002|2554->1025|2582->1026
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|66->35|66->35
                  -- GENERATED --
              */
          