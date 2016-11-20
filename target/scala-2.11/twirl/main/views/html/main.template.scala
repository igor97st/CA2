
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.32*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*7.62*/("""
        """),format.raw/*8.9*/("""<title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*11.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.59*/routes/*12.65*/.Assets.versioned("images/favicon.png")),format.raw/*12.104*/("""">
    </head>
    <body>
    <!-- start of nav section -->
    

    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                  <a class="navbar-brand" href=""""),_display_(/*28.50*/routes/*28.56*/.HomeController.index()),format.raw/*28.79*/("""">BookMarks</a>
                  
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">

                    <li """),_display_(/*35.26*/if(title == "Home")/*35.45*/{_display_(Seq[Any](format.raw/*35.46*/("""class="active"""")))}),format.raw/*35.61*/("""><a href=""""),_display_(/*35.72*/routes/*35.78*/.HomeController.index()),format.raw/*35.101*/("""">Home</a></li>

                    <li """),_display_(/*37.26*/if(title == "about")/*37.46*/{_display_(Seq[Any](format.raw/*37.47*/("""class="active"""")))}),format.raw/*37.62*/("""><a href=""""),_display_(/*37.73*/routes/*37.79*/.HomeController.about()),format.raw/*37.102*/("""">About Us</a></li>   
                    
                    <li """),_display_(/*39.26*/if(title == "categories")/*39.51*/{_display_(Seq[Any](format.raw/*39.52*/("""class="active"""")))}),format.raw/*39.67*/("""><a href=""""),_display_(/*39.78*/routes/*39.84*/.HomeController.about()),format.raw/*39.107*/("""">categories</a></li>
                     
                    
                    <li """),_display_(/*42.26*/if(title == "products")/*42.49*/{_display_(Seq[Any](format.raw/*42.50*/("""class="active"""")))}),format.raw/*42.65*/("""><a href=""""),_display_(/*42.76*/routes/*42.82*/.HomeController.products()),format.raw/*42.108*/("""">products</a></li>
                        
                    
					<li """),_display_(/*45.11*/if(title == "books")/*45.31*/{_display_(Seq[Any](format.raw/*45.32*/("""class="active"""")))}),format.raw/*45.47*/("""><a href=""""),_display_(/*45.58*/routes/*45.64*/.HomeController.books()),format.raw/*45.87*/("""">books</a></li>
                      
                    
					<li """),_display_(/*48.11*/if(title == "basket")/*48.32*/{_display_(Seq[Any](format.raw/*48.33*/("""class="active"""")))}),format.raw/*48.48*/("""><a href=""""),_display_(/*48.59*/routes/*48.65*/.HomeController.basket()),format.raw/*48.89*/("""">basket</a></li>
                        
                
                    <li """),_display_(/*51.26*/if(title == "login")/*51.46*/{_display_(Seq[Any](format.raw/*51.47*/("""class="active"""")))}),format.raw/*51.62*/("""><a href=""""),_display_(/*51.73*/routes/*51.79*/.HomeController.login()),format.raw/*51.102*/("""">login</a></li>
                    
                </ul>
            </div>


        </div>
        <!-- /.container -->
    </nav>


    <div class="container-fluid">
        """),format.raw/*64.32*/("""
        """),_display_(/*65.10*/content),format.raw/*65.17*/("""
    """),format.raw/*66.5*/("""</div>
    <footer class="container-fluid">
         <p></p>
     </footer>

    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*75.19*/routes/*75.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*75.66*/("""" type="text/javascript"></script>
</html>

"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Nov 18 11:16:33 GMT 2016
                  SOURCE: /home/wdd/webapps/CA2/playLab_CRUD-part1/app/views/main.scala.html
                  HASH: 3492e4861220a5e23ef17108e640cbedf49aa4a1
                  MATRIX: 748->2|873->32|901->34|980->139|1015->148|1049->156|1074->161|1349->409|1364->415|1427->456|1515->517|1530->523|1591->562|2330->1274|2345->1280|2389->1303|2707->1594|2735->1613|2774->1614|2820->1629|2858->1640|2873->1646|2918->1669|2987->1711|3016->1731|3055->1732|3101->1747|3139->1758|3154->1764|3199->1787|3295->1856|3329->1881|3368->1882|3414->1897|3452->1908|3467->1914|3512->1937|3629->2027|3661->2050|3700->2051|3746->2066|3784->2077|3799->2083|3847->2109|3950->2185|3979->2205|4018->2206|4064->2221|4102->2232|4117->2238|4161->2261|4259->2332|4289->2353|4328->2354|4374->2369|4412->2380|4427->2386|4472->2410|4584->2495|4613->2515|4652->2516|4698->2531|4736->2542|4751->2548|4796->2571|5004->2841|5041->2851|5069->2858|5101->2863|5463->3198|5478->3204|5540->3245
                  LINES: 27->2|32->2|34->4|37->7|38->8|38->8|38->8|41->11|41->11|41->11|42->12|42->12|42->12|58->28|58->28|58->28|65->35|65->35|65->35|65->35|65->35|65->35|65->35|67->37|67->37|67->37|67->37|67->37|67->37|67->37|69->39|69->39|69->39|69->39|69->39|69->39|69->39|72->42|72->42|72->42|72->42|72->42|72->42|72->42|75->45|75->45|75->45|75->45|75->45|75->45|75->45|78->48|78->48|78->48|78->48|78->48|78->48|78->48|81->51|81->51|81->51|81->51|81->51|81->51|81->51|93->64|94->65|94->65|95->66|104->75|104->75|104->75
                  -- GENERATED --
              */
          