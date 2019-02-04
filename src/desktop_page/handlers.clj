(ns desktop-page.handlers
   (:use
     [hiccup.core]
     [hiccup.page]
     ))
n
(defn hello-world []
  (println "Hello World"))
(hello-world)


(def sky (str "hello"))



(defn desktoppage
  [request]
  (html5 [:head (include-js "myscript.js") (include-css "mystyle.css")
[:meta {:charset "utf-8"}]
[:meta {:http-equiv "x-ua-compatible" :content "ie=edge"}]
[:title "desktop page"]
[:meta {:name "viewport" :content "width=device-width, initial-scale=1, shrink-to-fit=no"}]
[:link {:href "https://fonts.googleapis.com/css?family=Open+Sans:300,400,700" :rel "stylesheet"}]]

[:body

 [:div#bgimg {:style "background-image:url('img/img1.jpg')"}

 [:div.icons
 [:div.recyclebin {:style "background-image:url('img/img20.jpg')"}
 [:div.name " Recycle bin"]]
 [:div.chrome {:style "background-image:url('img/img5.svg')"}
 [:div.name "Chrome"]
  [:div.zoom]]
 [:div.internetexplorer {:style "background-image:url('img/img6.svg')"}
 [:div.name "Internet Explorer"]]]

 [:div.toolbars

 [:div.windows {:style "background-image:url('img/img9.svg')"}]
 [:div.battery {:style "background-image:url('img/img12.svg')"}]
 [:div.speaker {:style "background-image:url('img/img14.svg')"}]
 [:div.wifi{:style "background-image:url('img/img15.svg')"}]
 [:div.chrome{:style "background-image:url('img/img5.svg')"}
  [:div.zoom]]
 [:div#demo]
] ]] ))












