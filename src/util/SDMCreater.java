/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lol
 */
public class SDMCreater {

    private String basePath = "./"; // 基础路径，非必选
    private String packageName = null; // 包名，必选
    private List<String> paramName = null; // 属性名， 必选
    private String className = null; // 类名， 必选
    private String dataName = null; // 数据库表明， 必选
    private List<List<String>> list = null;

    public final SDMCreater reset() {
        packageName = null;
        className = null;
        dataName = null;
        paramName = new ArrayList();
        basePath = "./";
        return this;
    }

    public SDMCreater() {
        reset();
    }

    public SDMCreater setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public SDMCreater setClassName(String className) {
        this.className = className;
        return this;
    }

    public SDMCreater setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    public SDMCreater setDataName(String dataName) {
        this.dataName = dataName;
        return this;
    }

    public SDMCreater addParamName(String paramName) {
        this.paramName.add(paramName);
        return this;
    }

    public SDMCreater addParamNames(String[] paramNames) {
        if (paramNames != null) {
            for (String s : paramNames) {
                this.paramName.add(s);
            }
        }
        return this;
    }

    public SDMCreater addParamNames(List<String> paramNames) {
        if (paramNames != null) {
            for (String s : paramNames) {
                this.paramName.add(s);
            }
        }
        return this;
    }

    // 写函数名
    private StringBuffer printFunctionOfBefore(StringBuffer sb, String type, List<String> l, String method) {
        sb.append("    public ").append(type).append(" ").append(method).append("Of");
        for (int i = 0; i < l.size(); i++) {
            if (i != 0) { // 增加And
                sb.append("And");
            }
            sb.append(StringUtil.getUp(l.get(i)));
        }
        sb.append("(");
        return sb;
    }

    // 写函数后的参数
    private StringBuffer printFunctionOfAfter(StringBuffer sb, List<String> l, String method) {
        for (int i = 0; i < l.size(); i++) {
            if (i != 0) { // 增加And
                sb.append(", ");
            }
            sb.append("String ").append(l.get(i));
        }
        return sb;
    }

    // 写函数体
    private SDMCreater printFunctionOfBody(PrintWriter out, List<String> l, String method) {
        String u = StringUtil.getUp(className); // 首字母大写的类
        String c = StringUtil.getLow(className); // 首字母小写的类
        out.println("        " + u + " " + c + " = new " + u + "();");
        for (int i = 0; i < l.size(); i++) {
            out.println("        " + c + ".set" + StringUtil.getUp(l.get(i)) + "(" + l.get(i) + ");");
        }
        return this;
    }

    private SDMCreater printClassName(PrintWriter out) {
        out.println("public class " + className + " {");
        return this;
    }

    private SDMCreater printImport(PrintWriter out) {
        out.println("import java.util.List;");
        out.println();
        out.println("import " + packageName + ".entity." + className + ";");
        out.println();
        return this;
    }

    private SDMCreater printInterface(PrintWriter out, String method) {
        list = Arithmetic.combiner(paramName);
        out.println("    public int " + method + "(" + StringUtil.getUp(className) + " " + StringUtil.getLow(className) + ");");
        for (List<String> l : list) {
            StringBuffer sb = new StringBuffer();
            sb = printFunctionOfBefore(sb, "int", l, method);
            sb = printFunctionOfAfter(sb, l, method);
            sb.append(");");
            out.println(sb.toString());
        }
        return this;
    }

    private SDMCreater printInterfaceOfUpdate(PrintWriter out, String method) {
        list = Arithmetic.combiner(paramName);
        out.println("    public int " + method + "(" + StringUtil.getUp(className) + " " + StringUtil.getLow(className) + ", " + StringUtil.getUp(className) + " key" + StringUtil.getUp(className) + ");");
        for (List<String> l : list) {
            StringBuffer sb = new StringBuffer();
            sb = printFunctionOfBefore(sb, "int", l, method);
            sb.append(StringUtil.getUp(className)).append(" ").append(StringUtil.getLow(className)).append(", ");
            sb = printFunctionOfAfter(sb, l, method);
            sb.append(");");
            out.println(sb.toString());
        }
        return this;
    }

    private SDMCreater printInterfaceOfGet(PrintWriter out, String method) {
        list = Arithmetic.combiner(paramName);
        out.println("    public " + StringUtil.getUp(className) + " " + method + "(" + StringUtil.getUp(className) + " " + StringUtil.getLow(className) + ");");
        for (List<String> l : list) {
            StringBuffer sb = new StringBuffer();
            sb = printFunctionOfBefore(sb, StringUtil.getUp(className), l, method);
            sb = printFunctionOfAfter(sb, l, method);
            sb.append(");");
            out.println(sb.toString());
        }
        return this;
    }

    private SDMCreater printInterfaceOfGets(PrintWriter out, String method) {
        out.println("    public List<" + StringUtil.getUp(className) + "> " + method + "(" + StringUtil.getUp(className) + " " + StringUtil.getLow(className) + ");");
        for (List<String> l : list) {
            StringBuffer sb = new StringBuffer();
            sb = printFunctionOfBefore(sb, "List<" + StringUtil.getUp(className) + ">", l, method);
            sb = printFunctionOfAfter(sb, l, method);
            sb.append(");");
            out.println(sb.toString());
        }
        return this;
    }

    private SDMCreater printFunction(PrintWriter out) {
        list = Arithmetic.combiner(paramName);
        printInterfaceOfUpdate(out, "update");
        printInterface(out, "remove");
        printInterface(out, "insert");
        printInterfaceOfGet(out, "get" + StringUtil.getUp(className));
        printInterfaceOfGets(out, "get" + StringUtil.getUp(className) + "s");
        return this;
    }

    private SDMCreater printClassOfInsert(PrintWriter out, String method) {
        list = Arithmetic.combiner(paramName);
        out.println("    public int " + method + "(" + StringUtil.getUp(className) + " " + StringUtil.getLow(className) + ") {");
        out.println("        return DBMan.getInstance().insertWithoutThrow(" + StringUtil.getLow(className) + ", \"" + dataName + "\");");
        out.println("    }");
        for (List<String> l : list) {
            StringBuffer sb = new StringBuffer();
            sb = printFunctionOfBefore(sb, "int", l, method);
            sb = printFunctionOfAfter(sb, l, method);
            sb.append(") {");
            out.println(sb.toString());
            printFunctionOfBody(out, l, method);
            out.println("        return " + method + "(" + StringUtil.getLow(className) + ");");
            out.println("    }");
        }
        return this;
    }

    private SDMCreater printClassOfRemove(PrintWriter out, String method) {
        list = Arithmetic.combiner(paramName);
        out.println("    public int " + method + "(" + StringUtil.getUp(className) + " " + StringUtil.getLow(className) + ") {");
        out.println("        return DBMan.getInstance().deleteWithoutThrow(" + StringUtil.getLow(className) + ", \"" + dataName + "\");");
        out.println("    }");
        for (List<String> l : list) {
            StringBuffer sb = new StringBuffer();
            sb = printFunctionOfBefore(sb, "int", l, method);
            sb = printFunctionOfAfter(sb, l, method);
            sb.append(") {");
            out.println(sb.toString());
            printFunctionOfBody(out, l, method);
            out.println("        return " + method + "(" + StringUtil.getLow(className) + ");");
            out.println("    }");
        }
        return this;
    }

    private SDMCreater printClassOfUpdate(PrintWriter out, String method) {
        list = Arithmetic.combiner(paramName);
        out.println("    public int " + method + "(" + StringUtil.getUp(className) + " " + StringUtil.getLow(className) + ", " + StringUtil.getUp(className) + " key" + StringUtil.getUp(className) + ") {");
        out.println("        return DBMan.getInstance().updateWithoutThrow(" + StringUtil.getLow(className) + ", key" + StringUtil.getUp(className) + ", \"" + dataName + "\");");
        out.println("    }");
        for (List<String> l : list) {
            StringBuffer sb = new StringBuffer();
            sb = printFunctionOfBefore(sb, "int", l, method);
            sb.append(StringUtil.getUp(className)).append(" ").append(StringUtil.getLow(className)).append(", ");
            sb = printFunctionOfAfter(sb, l, method);
            sb.append(") {");
            out.println(sb.toString());
            String u = StringUtil.getUp(className); // 首字母大写的类
            String c = StringUtil.getLow(className); // 首字母小写的类
            out.println("        " + u + " k" + u + " = new " + u + "();");
            for (int i = 0; i < l.size(); i++) {
                out.println("        k" + u + ".set" + StringUtil.getUp(l.get(i)) + "(" + l.get(i) + ");");
            }
            out.println("        return " + method + "(" + StringUtil.getLow(className) + ", k" + StringUtil.getUp(className) + ");");
            out.println("    }");
        }
        return this;
    }

    private SDMCreater printClassOfGet(PrintWriter out, String method) {
        list = Arithmetic.combiner(paramName);
        out.println("    public " + StringUtil.getUp(className) + " " + method + "(" + StringUtil.getUp(className) + " " + StringUtil.getLow(className) + ") {");
        out.println("        return DBMan.getInstance().queryByIdWithoutThrow(" + StringUtil.getLow(className) + ", \"" + dataName + "\");");
        out.println("    }");
        for (List<String> l : list) {
            StringBuffer sb = new StringBuffer();
            sb = printFunctionOfBefore(sb, StringUtil.getUp(className), l, method);
            sb = printFunctionOfAfter(sb, l, method);
            sb.append(") {");
            out.println(sb.toString());
            printFunctionOfBody(out, l, method);
            out.println("        return " + method + "(" + StringUtil.getLow(className) + ");");
            out.println("    }");
        }
        return this;
    }

    private SDMCreater printClassOfGets(PrintWriter out, String method) {
        out.println("    public List<" + StringUtil.getUp(className) + "> " + method + "(" + StringUtil.getUp(className) + " " + StringUtil.getLow(className) + ") {");
        out.println("        return DBMan.getInstance().queryWithoutThrow(" + StringUtil.getLow(className) + ", \"" + dataName + "\");");
        out.println("    }");
        for (List<String> l : list) {
            StringBuffer sb = new StringBuffer();
            sb = printFunctionOfBefore(sb, "List<" + StringUtil.getUp(className) + ">", l, method);
            sb = printFunctionOfAfter(sb, l, method);
            sb.append(") {");
            out.println(sb.toString());
            printFunctionOfBody(out, l, method);
            out.println("        return " + method + "(" + StringUtil.getLow(className) + ");");
            out.println("    }");
        }
        return this;
    }

    private SDMCreater printFunctionOfClass(PrintWriter out) {
        list = Arithmetic.combiner(paramName);
        printClassOfUpdate(out, "update");
        printClassOfRemove(out, "remove");
        printClassOfInsert(out, "insert");
        printClassOfGet(out, "get" + StringUtil.getUp(className));
        printClassOfGets(out, "get" + StringUtil.getUp(className) + "s");
        return this;
    }

    // 获得函数名
    private String getFuntionNameByService(List<String> l, String method) {
        StringBuffer sb = new StringBuffer();
        sb.append(method).append("Of");
        for (int i = 0; i < l.size(); i++) {
            if (i != 0) { // 增加And
                sb.append("And");
            }
            sb.append(StringUtil.getUp(l.get(i)));
        }
        sb.append("(");
        for (int i = 0; i < l.size(); i++) {
            if (i != 0) { // 增加And
                sb.append(", ");
            }
            sb.append(l.get(i));
        }
        return sb.toString();
    }

    private SDMCreater printClassOfInsertByService(PrintWriter out, String method) {
        list = Arithmetic.combiner(paramName);
        out.println("    public int " + method + "(" + StringUtil.getUp(className) + " " + StringUtil.getLow(className) + ") {");
        out.println("        return dao." + method + "(" + StringUtil.getLow(className) + ");");
        out.println("    }");
        for (List<String> l : list) {
            StringBuffer sb = new StringBuffer();
            sb = printFunctionOfBefore(sb, "int", l, method);
            sb = printFunctionOfAfter(sb, l, method);
            sb.append(") {");
            out.println(sb.toString());
            out.println("        return dao." + getFuntionNameByService(l, method) + ");");
            out.println("    }");
        }
        return this;
    }

    private SDMCreater printClassOfRemoveByService(PrintWriter out, String method) {
        list = Arithmetic.combiner(paramName);
        out.println("    public int " + method + "(" + StringUtil.getUp(className) + " " + StringUtil.getLow(className) + ") {");
        out.println("        return dao." + method + "(" + StringUtil.getLow(className) + ");");
        out.println("    }");
        for (List<String> l : list) {
            StringBuffer sb = new StringBuffer();
            sb = printFunctionOfBefore(sb, "int", l, method);
            sb = printFunctionOfAfter(sb, l, method);
            sb.append(") {");
            out.println(sb.toString());
            out.println("        return dao." + getFuntionNameByService(l, method) + ");");
            out.println("    }");
        }
        return this;
    }

    private SDMCreater printClassOfUpdateByService(PrintWriter out, String method) {
        list = Arithmetic.combiner(paramName);
        out.println("    public int " + method + "(" + StringUtil.getUp(className) + " " + StringUtil.getLow(className) + ", " + StringUtil.getUp(className) + " key" + StringUtil.getUp(className) + ") {");
        out.println("        return dao." + method + "(" + StringUtil.getLow(className) + ", key" + StringUtil.getUp(className) + ");");
        out.println("    }");
        for (List<String> l : list) {
            StringBuffer sb = new StringBuffer();
            sb = printFunctionOfBefore(sb, "int", l, method);
            sb.append(StringUtil.getUp(className)).append(" ").append(StringUtil.getLow(className)).append(", ");
            sb = printFunctionOfAfter(sb, l, method);
            sb.append(") {");
            out.println(sb.toString());
            sb = new StringBuffer();
            sb.append(method).append("Of");
            for (int i = 0; i < l.size(); i++) {
                if (i != 0) { // 增加And
                    sb.append("And");
                }
                sb.append(StringUtil.getUp(l.get(i)));
            }
            sb.append("(");
            sb.append(StringUtil.getLow(className)).append(", ");
            for (int i = 0; i < l.size(); i++) {
                if (i != 0) { // 增加And
                    sb.append(", ");
                }
                sb.append(l.get(i));
            }
            out.println("        return dao." + sb.toString() + ");");
            out.println("    }");
        }
        return this;
    }

    private SDMCreater printClassOfGetByService(PrintWriter out, String method) {
        list = Arithmetic.combiner(paramName);
        out.println("    public " + StringUtil.getUp(className) + " " + method + "(" + StringUtil.getUp(className) + " " + StringUtil.getLow(className) + ") {");
        out.println("        return dao." + method + "(" + StringUtil.getLow(className) + ");");
        out.println("    }");
        for (List<String> l : list) {
            StringBuffer sb = new StringBuffer();
            sb = printFunctionOfBefore(sb, StringUtil.getUp(className), l, method);
            sb = printFunctionOfAfter(sb, l, method);
            sb.append(") {");
            out.println(sb.toString());
            out.println("        return dao." + getFuntionNameByService(l, method) + ");");
            out.println("    }");
        }
        return this;
    }

    private SDMCreater printClassOfGetsByService(PrintWriter out, String method) {
        out.println("    public List<" + StringUtil.getUp(className) + "> " + method + "(" + StringUtil.getUp(className) + " " + StringUtil.getLow(className) + ") {");
        out.println("        return dao." + method + "(" + StringUtil.getLow(className) + ");");
        out.println("    }");
        for (List<String> l : list) {
            StringBuffer sb = new StringBuffer();
            sb = printFunctionOfBefore(sb, "List<" + StringUtil.getUp(className) + ">", l, method);
            sb = printFunctionOfAfter(sb, l, method);
            sb.append(") {");
            out.println(sb.toString());
            out.println("        return dao." + getFuntionNameByService(l, method) + ");");
            out.println("    }");
        }
        return this;
    }

    private SDMCreater printFunctionOfClassByService(PrintWriter out) {
        list = Arithmetic.combiner(paramName);
        printClassOfUpdateByService(out, "update");
        printClassOfRemoveByService(out, "remove");
        printClassOfInsertByService(out, "insert");
        printClassOfGetByService(out, "get" + StringUtil.getUp(className));
        printClassOfGetsByService(out, "get" + StringUtil.getUp(className) + "s");
        return this;
    }

    private SDMCreater printParam(PrintWriter out, String param) {
        out.println("    private String " + param + ";");
        return this;
    }

    private SDMCreater printParams(PrintWriter out) {
        for (String str : paramName) {
            printParam(out, str);
        }
        out.println();
        return this;
    }

    private SDMCreater printGetterAndSetter(PrintWriter out, String param) {
        // 输出getter
        out.println("    public String get"
                + param.substring(0, 1).toUpperCase() + param.substring(1)
                + "() {");
        out.println("        return " + param + ";");
        out.println("    }");
        out.println();
        // 输出setter
        out.println("    public void set"
                + param.substring(0, 1).toUpperCase() + param.substring(1)
                + "(String " + param + ") {");
        out.println("        this." + param + " = " + param + ";");
        out.println("    }");
        out.println();
        return this;
    }

    private SDMCreater printGetterAndSetters(PrintWriter out) {
        for (String str : paramName) {
            printGetterAndSetter(out, str);
        }
        return this;
    }

    private SDMCreater printToString(PrintWriter out) {
        out.println("    @Override");
        out.println("    public String toString() {");
        StringBuffer sb = new StringBuffer("        return \"");
        sb.append(className).append(" [");
        for (String str : paramName) {
            sb.append(str).append("=\" + ").append(str).append(" + \", ");
        }
        sb.append("]\";");
        out.println(sb.toString());
        out.println("    }");
        out.println();
        return this;
    }

    private SDMCreater printEnd(PrintWriter out) {
        out.println("}");
        return this;
    }

    /**
     * 生成包文件夹
     *
     * @return
     */
    private SDMCreater createPackage() {
        String[] dirs = packageName.split("\\.");
        for (String str : dirs) {
            basePath = FileUtil.checkDirName(basePath);
            System.out.println("mkdir: " + basePath + str);
            basePath = FileUtil.mkdir(basePath, str);
        }
        return this;
    }

    /**
     * 生成Entity类
     *
     * @return
     */
    private SDMCreater createEntity() {
        String path = basePath;
        // 将packageName临时保存
        path = FileUtil.mkdir(path, "entity");
        File file = FileUtil.mkFile(path, className + ".java");
        PrintWriter out = FileUtil.getPrintWriter(file);
        out.println("package " + packageName + ".entity;");
        out.println();
        // out = new PrintWriter(System.out);
        printClassName(out)
                .printParams(out)
                .printGetterAndSetters(out)
                .printToString(out)
                .printEnd(out);
        out.flush();
        System.out.println(file);
        return this;
    }

    /**
     * 生成Dao接口
     *
     * @return
     */
    private SDMCreater createDao() {
        String path = basePath;
        // 将packageName和className临时保存
        path = FileUtil.mkdir(path, "dao");
        File file = FileUtil.mkFile(path, "I" + this.className + "Dao" + ".java");
        PrintWriter out = FileUtil.getPrintWriter(file);
        // 声明包名
        out.println("package " + packageName + ".dao;");
        out.println();
        // 声明引用包
        printImport(out);
        // 声明接口
        out.println("public interface I" + className + "Dao {");
        printFunction(out)
                .printEnd(out);
        out.flush();
        System.out.println(file);
        return this;
    }

    /**
     * 生成DaoImpl类
     *
     * @return
     */
    private SDMCreater createDaoImpl() {
        String path = basePath;
        // 将packageName和className临时保存
        path = FileUtil.mkdir(path, "daoImpl");
        File file = FileUtil.mkFile(path, "I" + this.className + "DaoImpl" + ".java");
        PrintWriter out = FileUtil.getPrintWriter(file);
        // out = new PrintWriter(System.out);
        out.println("package " 
                + packageName + ".daoImpl;");
        out.println();
        printImport(out);
        out.println("import "
                + packageName + ".dao.I" + className + "Dao;");
        out.println("import db.DBMan;");
        out.println();
        out.println("public class I" + className + "DaoImpl implements I" + className + "Dao {");
        printFunctionOfClass(out);
        printEnd(out);
        out.flush();
        System.out.println(file);
        return this;
    }

    /**
     * 生成Service接口
     *
     * @return
     */
    private SDMCreater createService() {
        String path = basePath;
        // 将packageName和className临时保存
        path = FileUtil.mkdir(path, "service");
        File file = FileUtil.mkFile(path, "I" + this.className + "Service" + ".java");
        PrintWriter out = FileUtil.getPrintWriter(file);
        // 声明包名
        out.println("package " + packageName + ".service;");
        out.println();
        // 声明引用包
        printImport(out);
        // 声明接口
        out.println("public interface I" + className + "Service {");
        printFunction(out)
                .printEnd(out);
        out.flush();
        System.out.println(file);
        return this;
    }

    /**
     * 生成Service类
     *
     * @return
     */
    private SDMCreater createServiceImpl() {
        String path = basePath;
        // 将packageName和className临时保存
        path = FileUtil.mkdir(path, "serviceImpl");
        File file = FileUtil.mkFile(path, "I" + this.className + "ServiceImpl" + ".java");
        PrintWriter out = FileUtil.getPrintWriter(file);
        // out = new PrintWriter(System.out);
        out.println("package " 
                + packageName + ".serviceImpl;");
        out.println();
        printImport(out);
        out.println("import "
                + packageName + ".dao.I" + StringUtil.getUp(className) + "Dao;\n"
                + "import "
                + packageName + ".daoImpl.I" + StringUtil.getUp(className) + "DaoImpl;");
        out.println("import "
                + packageName + ".service.I" + StringUtil.getUp(className) + "Service;");
        out.println();
        out.println("public class I" + StringUtil.getUp(className)
                + "ServiceImpl implements I"
                + StringUtil.getUp(className)
                + "Service {");
        out.println("	I" + StringUtil.getUp(className) + "Dao dao = null;\n"
                + "\n"
                + "	public I" + StringUtil.getUp(className) + "ServiceImpl() {\n"
                + "		dao = new I" + StringUtil.getUp(className) + "DaoImpl();\n"
                + "	}");
        printFunctionOfClassByService(out);
        printEnd(out);
        out.flush();
        System.out.println(file);
        return this;
    }

    public void build() {
        createPackage().createEntity().createDao().createDaoImpl().createService().createServiceImpl();
    }
    
    public static void main(String[] args) {
        String[] strs = {"newsid", "title", "body", "typeid", "newsdate", "userid", "status"};
        new SDMCreater().setPackageName("com.news.linglian")
                .setClassName("News")
                .setDataName("news")
                .setBasePath("C:\\eclipse\\newsystem\\src")
                .addParamNames(strs)
                .build();
    }
}
