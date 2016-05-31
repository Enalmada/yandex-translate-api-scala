package controllers

import javax.inject._

import play.api.Configuration
import play.api.mvc._
import zhmyh.yandex.api.translate.{Language, Translate}
import zhmyh.yandex.api.translate.{Language => Lg}

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class HomeController @Inject() (implicit val config: Configuration) extends Controller {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def index(text: String) = Action {
    val apiKey = config.getString("yandex.key").get
    val tr = new Translate(apiKey)
    val translated = if(text.nonEmpty) {tr.translate(text, Lg.ENGLISH, Lg.SPANISH).get} else ""
    Ok(views.html.index(translated))
  }




  // Obviously you should put everything in here that is important to the success of your app.
  def health = Action {
    Ok("Healthy")
  }

}
