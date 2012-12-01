# Dependencies

- Requires sbt 0.12.1 to build.

# How to run

Clone this repository, then run the application in one of the following ways.

- Locally using sbt

        $ sbt clean compile run
        ...
	[success] Total time: 6 s, completed Dec 1, 2012 12:08:50 AM
	[info] Running spray.examples.Boot 
	12/01 00:08:50 INFO [spray-examples-Boot-akka.actor.default-dispatcher-2] a.e.s.Slf4jEventHandler - Slf4jEventHandler started
	12/01 00:08:50 INFO [spray-examples-Boot-akka.actor.default-dispatcher-2] s.i.IOBridge - IOBridge 'akka://spray-examples-Boot/user/io-bridge' started
	12/01 00:08:51 INFO [spray-examples-Boot-akka.actor.default-dispatcher-2] s.c.s.HttpServer - akka://spray-examples-Boot/user/http-server started on /0.0.0.0:8080

- Locally using foreman (simulates Heroku)

        $ sbt clean compile stage
        ...
	[success] Total time: 23 s, completed Dec 1, 2012 12:10:20 AM
	[info] Wrote start script for mainClass := Some(spray.examples.Boot) to /Users/laufer/Work/GitHub/webservices-cs-luc-edu/spray-routing-simple-heroku/target/start
	[success] Total time: 0 s, completed Dec 1, 2012 12:10:20 AM

        $ foreman start
	00:10:57 web.1     | started with pid 8144
	00:10:58 web.1     | 12/01 00:10:58 INFO [spray-examples-Boot-akka.actor.default-dispatcher-2] a.e.s.Slf4jEventHandler - Slf4jEventHandler started
	00:10:58 web.1     | 12/01 00:10:58 INFO [spray-examples-Boot-akka.actor.default-dispatcher-2] s.i.IOBridge - IOBridge 'akka://spray-examples-Boot/user/io-bridge' started
	00:10:59 web.1     | 12/01 00:10:59 INFO [spray-examples-Boot-akka.actor.default-dispatcher-4] s.c.s.HttpServer - akka://spray-examples-Boot/user/http-server started on /0.0.0.0:5000

- On Heroku

    [These instructions](http://devcenter.heroku.com/articles/scala#deploy_to_herokucedar) should
    work out of the box. The last few lines of the output should look like this.

	       [success] Total time: 5 s, completed Dec 1, 2012 6:13:21 AM
	       [info] Wrote start script for mainClass := Some(spray.examples.Boot) to /tmp/build_326t41ltqpc34/target/start
	       [success] Total time: 0 s, completed Dec 1, 2012 6:13:21 AM
	-----> Discovering process types
	       Procfile declares types -> web
	-----> Compiled slug size: 83.1MB
	-----> Launching... done, v9
	       http://laufer-spray-routing-simple.herokuapp.com deployed to Heroku

	To git@heroku.com:laufer-spray-routing-simple.git
	   2023f74..c0c4824  master -> master

    Now you can connect to the app URL `http://quiet-samurai-5737.herokuapp.com` *on port 80*. 
    There is an internal port that varies across invocations of the app, but the app 
    is always exposed on port 80.
