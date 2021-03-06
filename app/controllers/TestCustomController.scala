package controllers


import javax.inject._
import play.api.mvc._
import scala.concurrent.Future
import custom.actions.CustomSecureAction
/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class TestCustomController @Inject()(
                                      customSecureAction:CustomSecureAction,
                                      cc: ControllerComponents) extends AbstractController(cc) {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def testCustomSecureAction = customSecureAction {
    Ok("Header test has passed")
  }

}
