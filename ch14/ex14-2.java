// 예제 14.2 인터페이스와 컬렉션 래퍼

//org.hibernate.collection.internal.PersistentBag
@OneToMeny
Collection<Member> collection = new ArrayList<Member>();

//org.hibernate.collection.internal.PersistentBag
@OneToMany
List<Member> list = new ArrayList<Member>();

//org.hibernate.collection.internal.PersistentSet
@OneToMany
Set<Member> set = new HashSet<Member>();

//org.hibernate.collection.internal.PersistentList
@OneToMany @OrderColumn
List<Member> orderColumnList = new ArrayList<Member>();
