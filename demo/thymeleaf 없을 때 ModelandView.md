- thymeleaf 없을 때 ModelandView

![image-20221122204736272](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221122204736272.png)

![image-20221122205352694](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221122205352694.png)

<form> method ="post" actions="/board/insert" 경로를 해놓고, 
    
</form>

메서드와 경로가 맞아야 함

![image-20221122212535657](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221122212535657.png)



- 의존한다: 클래스(A)를 하나 정의하고, 내부에 어떤 객체(B)가 있다고 한다면, B가 어떻게 바뀌냐에 따라 A도 바뀐다. => A가 B에 의존한다.

![image-20221122212756597](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221122212756597.png)

![image-20221122213512775](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221122213512775.png)

![image-20221122213628511](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221122213628511.png)

![image-20221122214612703](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221122214612703.png)



- controller
- service 정의 > list() 추상메서드 정의
- BoardServiceImpl : 서비스 구현 클래스에서 list() 추상메서드를 overriding
- mapper > list() 메서드 정의
- 그 메서드랑 일치하는 BoardMapper.xml 의 id를 갖는 쿼리를 짜줌

- template > index.html
- 