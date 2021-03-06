package ov_chipcard


object Consumer extends App {
  val log = org.slf4j.LoggerFactory.getLogger("Consumer")

  val channel = new Channel(
    queue = "ov-chipcard"
  )

  log.info("Waiting for messages. To exit press ENTER")

  channel subscribe { event =>
    /* Replace with consumer logic */
    log.info(s"Received event:\n$event")
  }

  scala.io.StdIn.readLine()

  channel.close()
}

