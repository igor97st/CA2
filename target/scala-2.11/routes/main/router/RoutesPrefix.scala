
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/CA2/playLab_CRUD-part1/conf/routes
// @DATE:Fri Nov 18 11:00:14 GMT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
