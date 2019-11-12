-- 예제 10.39 Like 식 예제

//중간에 원이라는 단어가 들어간 회원(좋은회원, 회원, 원)
select m from Member m
where m.username like '%원%'

//처음에 회원이라는 단어가 포함(회원1, 회원ABC)
where m.username like '회원%'

//마지막에 회원이라는 단어가 포함(좋은 회원, A회원)
where m.username like '%회원'

//회원A, 회원1
where m.username like '회원_'

//회원3
where m.usernmae like '__3'

//회원%
where m.username like '회원\%' ESCAPE '\'
