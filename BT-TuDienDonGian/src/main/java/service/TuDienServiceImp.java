package service;

public class TuDienServiceImp implements TuDienService{

    @Override
    public String search(String value) throws Exception {
       String eng [] = {"hello", "computer","bye","afternoon","morning"};
       String vn [] = {"Chào","Máy Tính","tạm biệt","buổi chiều","buổi sáng"};
       int check = -1;
       for(int i = 0; i < eng.length; i++) {
           if (eng[i].equalsIgnoreCase(value)) {
               check = i;
           }
       }
       if(check > -1) {
           return vn[check];
       }else {
           return "not have in distionary";
       }
    }
}
