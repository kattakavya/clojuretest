(defproject desktop-page "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.4.0"]
                 [hiccup "1.0.5"]
                 [compojure "1.3.4"]
                ]
  :main desktop-page.core
  :profiles {:dev
             {:main desktop-page.core/-dev-main}}
  :codox {:namspaces [clojure.test.check]
                     [cloue.test.check.generators]}
  )
