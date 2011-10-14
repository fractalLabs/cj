(ns cj.a)

(comment 
  "aparentemente tienen que estar cargadas, checar q sean puras d core"
  "las d otras libs pueden ir en cj.a.nombre-lib"
(defalias da defalias)
(da ap apply)
(da d def)
(da dn defn)
(da dm defmacro)
(da dme defmethod)
  (da dr defrecord)


(da hm hash-map)
(da sm sorted-map)
  (da hs hash-set)
  sm-by sorted-map-by
  reduc reductions
  
  trans transient
(da fil filter)
(da red reduce)
  (da dis distinct)

(da lu loop)
(da rec recur)
(da ca case)

(da fi first)
(da sec second)
(da re rest)
(da la last)
(da bla butlast)
(da cu count)

(da e empty)

;;
(da dr dorun)
    
        
(da e? empty?)
(da p? pos?)
(da ne? neg?)
(da ni? nil?)
(da num? number?)
(da subs? substring?)
(da kwd? keyword?)
  (da f? false?) ;float
  (da t? true?)
(da vec? vector?)
(da l? list?)
(da ins? instance?)
(da seq? sequential?)
  (da s? string?)
(da srtd? sorted?)
  rev? reversible
  idem? identical?
  ext? extends?
  fut? future?
  count? counted?
  assoc? associative?
  dec? decimal?
  
  destruct destructure
  numer numerator
  rev reverse
  
  ration rationalize
  denom denominator
  inter interleave ;interpose
  
(da ass assoc)
(da dis dissoc)
(da me merge)
(da flat flatten)


(da w spit)
(da r slurp)


(da le let)

(da part partition)
  (da part-by partition-by)
  ;partial

(da r-s re-seq)
(da r-f re-find)
(da r-p re-pattern)

(da mexp macroexpand)
(da mexp-1 macroexpand-1)
  
(da p print)
(da pl println)

(da zip zipmap)
  
  
  (da ns-a ns-aliases) ;all-ns
  (da ns-r ns-refers) ;remove-ns ns-resolve
    (da ns-t the-ns)
  (da ns-u ns-unalias) ;ns-unmap
  (da ns-p ns-publics)
  (da ns-i ns-interns)
  
  
(da kwd keyword)
(da sym symbol)
(da bool boolean)
(da ve vector)
(da quo quote)
  
  (da src source)
  
  
  (da destruct destructure)
  (da shfl shuffle)
  (da iter iterate)
  
  (da desc descendants)
)