(defproject cj "1.0.0-SNAPSHOT"
  :description "FIXME: project description"
  :main cj.main
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [fm/fm "1.0.0-SNAPSHOT"]]
  :dev-dependencies [[mycroft/mycroft "0.0.2"]]
  :repositories {"fractal" {:url "http://67.205.67.146:8099/archiva/repository/fractal"}, 
                 "snapshots" {:url "http://67.205.67.146:8099/archiva/repository/snapshots"}})