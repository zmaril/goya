(ns goya.appstate)


(def width 64)
(def height 64) 

(def app-state
  (atom
    {:main-app
      {
       :palette
       [{:color "#228751" :text ""}
        {:color "#007536" :text ""}
        {:color "#65016C" :text ""}
        {:color "#C936D3" :text ""}
        {:color "#A67A00" :text ""}
        {:color "#BF9930" :text ""}]

       :image-data (vec (take (* width*height) (repeat "#00000")))
       :canvas-width width
       :canvas-height height

       :undo-history
         [{:action "Opened New Document" :icon "tag"}]
      }

     :info
     {
       :title "Goya"
       :subtitle "pixel art studio"
       :version "v0.0.1a"
     }

     :zoom-factor 6

     :tools
     {
       :paint-color "#828282"
       :paint-tool :pencil
       :grid-on false
     }

     :history-menu-items{:undo {:text "Undo"}
                         :redo {:text "Redo"}}

     :main-menu-items{:new-document {:text "Prime Canvas" :icon "icon-doc-inv" :command :new-doc}
                      :inspiration {:text "Inspiration from the Masters" :icon "icon-cloud-flash" :command :inspire}
                      :export-document {:text "Export Canvas" :icon "icon-download" :command :export-doc}}}))
