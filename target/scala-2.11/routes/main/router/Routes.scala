
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/CA2/playLab_CRUD-part1/conf/routes
// @DATE:Fri Nov 18 11:00:14 GMT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:22
  CountController_3: controllers.CountController,
  // @LINE:24
  AsyncController_2: controllers.AsyncController,
  // @LINE:27
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:22
    CountController_3: controllers.CountController,
    // @LINE:24
    AsyncController_2: controllers.AsyncController,
    // @LINE:27
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(name:String ?= "visitor")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.HomeController.products"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basket""", """controllers.HomeController.basket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories""", """controllers.HomeController.categories"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.HomeController.books"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_about1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about1_invoker = createInvoker(
    HomeController_0.about,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      """""",
      this.prefix + """about"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_products2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_HomeController_products2_invoker = createInvoker(
    HomeController_0.products,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "products",
      Nil,
      "GET",
      """""",
      this.prefix + """products"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_basket3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basket")))
  )
  private[this] lazy val controllers_HomeController_basket3_invoker = createInvoker(
    HomeController_0.basket,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "basket",
      Nil,
      "GET",
      """""",
      this.prefix + """basket"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_categories4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_HomeController_categories4_invoker = createInvoker(
    HomeController_0.categories,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "categories",
      Nil,
      "GET",
      """""",
      this.prefix + """categories"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_books5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_HomeController_books5_invoker = createInvoker(
    HomeController_0.books,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "books",
      Nil,
      "GET",
      """""",
      this.prefix + """books"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_login6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login6_invoker = createInvoker(
    HomeController_0.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_CountController_count7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count7_invoker = createInvoker(
    CountController_3.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_AsyncController_message8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message8_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params) =>
      call(params.fromQuery[String]("name", Some("visitor"))) { (name) =>
        controllers_HomeController_index0_invoker.call(HomeController_0.index(name))
      }
  
    // @LINE:9
    case controllers_HomeController_about1_route(params) =>
      call { 
        controllers_HomeController_about1_invoker.call(HomeController_0.about)
      }
  
    // @LINE:11
    case controllers_HomeController_products2_route(params) =>
      call { 
        controllers_HomeController_products2_invoker.call(HomeController_0.products)
      }
  
    // @LINE:13
    case controllers_HomeController_basket3_route(params) =>
      call { 
        controllers_HomeController_basket3_invoker.call(HomeController_0.basket)
      }
  
    // @LINE:15
    case controllers_HomeController_categories4_route(params) =>
      call { 
        controllers_HomeController_categories4_invoker.call(HomeController_0.categories)
      }
  
    // @LINE:17
    case controllers_HomeController_books5_route(params) =>
      call { 
        controllers_HomeController_books5_invoker.call(HomeController_0.books)
      }
  
    // @LINE:19
    case controllers_HomeController_login6_route(params) =>
      call { 
        controllers_HomeController_login6_invoker.call(HomeController_0.login)
      }
  
    // @LINE:22
    case controllers_CountController_count7_route(params) =>
      call { 
        controllers_CountController_count7_invoker.call(CountController_3.count)
      }
  
    // @LINE:24
    case controllers_AsyncController_message8_route(params) =>
      call { 
        controllers_AsyncController_message8_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:27
    case controllers_Assets_versioned9_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
