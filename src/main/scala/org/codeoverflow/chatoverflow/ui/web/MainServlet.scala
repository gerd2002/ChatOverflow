package org.codeoverflow.chatoverflow.ui.web

import org.codeoverflow.chatoverflow.ChatOverflow
import org.codeoverflow.chatoverflow.configuration.Credentials
import org.scalatra._
import org.scalatra.scalate.ScalateSupport

/**
  * @author vetterd
  */
class MainServlet extends ScalatraServlet with ScalateSupport {

  val defaultLayout = "/WEB-INF/layouts/default.ssp"

  before() {
    contentType = "text/html"
  }

  get("/dashboard") {
    ssp(
      "/WEB-INF/pages/main.ssp",
      "layout" -> defaultLayout,
      "title" -> "CodeOverflow",
      "credentials" -> Seq(new Credentials("asd"))
    )
  }

  get("/") {
    ssp(
      "/WEB-INF/pages/login.ssp",
      "layout" -> defaultLayout,
      "title" -> "CodeOverflow Login Page"
    )
  }
}
