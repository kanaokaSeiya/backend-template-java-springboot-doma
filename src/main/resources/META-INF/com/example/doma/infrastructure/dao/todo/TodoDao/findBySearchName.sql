select
    *
from
    todo
where
/*%if name != null */
    name LIKE /* @prefix(name) */'%'
/*%end*/
;