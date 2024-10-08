(defproject task-canvas-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [faker "0.3.2"]
                 [clj-http "3.13.0"]
                 [cheshire "5.13.0"]
                 [nubank/mockfn "0.7.0"]
                 [nubank/matcher-combinators "3.9.1"]]
  :main ^:skip-aot task-canvas-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
