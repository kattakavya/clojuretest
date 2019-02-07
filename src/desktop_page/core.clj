(ns desktop-page.core

(:require [compojure.core :refer [defroutes GET]]
          [compojure.route :refer [not-found resources]]
          [desktop-page.handlers :as handler]
          [ring.middleware.reload :refer [wrap-reload]]
          [ring.adapter.jetty :as jetty]
;;           [ring.handler.dump :refer [handle-dump]]
          ))

(defroutes app
  (GET "/" [] handler/desktoppage)
  (resources "/")
  (not-found "Sry, page not found"))


(defn -main
  "A very simple web server using Ring & Jetty"
  [port-number]
  (jetty/run-jetty app
     {:port (Integer. port-number)}))

(defn -dev-main
  "A very simple web server using Ring & Jetty that reloads code changes via the development profile of Leiningen"
  [port-number]
  (jetty/run-jetty (wrap-reload #'app)
     {:port (Integer. port-number)}))
