字节流：
    InputStream
    OutputStream
    IO:
        FileInputStream
        FileOutputStream
    缓冲流：
        BufferedInputStream
        BufferedOutputStream
字符流：
    Reader
    Writer
    IO:
        FileReader
        FileWriter
    缓冲流：
        BufferedReader
        BufferedWriter
字节->字符：
    InputStreamReader
    OutputStreamWriter
    
resources:
    application.properties:
        可以获得pom里的一些属性: ${project.name} ...

继承：独立打包
聚合：统一打包
    父：<packaging>pom</packageing>
    指定子模块
    
依赖管理：
    A存放B, C依赖，B，C按条件从A中引
    爷爷：
        依赖管理：
            小明
            小红
        模块：爸爸
    爸爸：
        模块：
            小明
            小红
    其他人：
         可直接依赖：
            小明
            小红
           
    
        