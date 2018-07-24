package com.codes.Object_oriented.cache;

public class CachesImmutale {
    private static int Max_Size = 10;
    private static CachesImmutale[] cache = new CachesImmutale[Max_Size];
    private static int pos = 0;
    private final String name;
    private CachesImmutale(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public static CachesImmutale valueOf(String name){
        for(int i = 0; i < Max_Size; i++){
            if (cache[i] != null && cache[i].getName().equals(name)) {
                return cache[i];
            }
        }
        if (pos == Max_Size) {
            cache[0] = new CachesImmutale(name);
            pos = 1;
        }else {
            cache[pos++] = new CachesImmutale(name);
        }
        return cache[pos - 1];
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if (obj != null && obj.getClass() == CachesImmutale.class) {
            CachesImmutale ci = (CachesImmutale) obj;
            return name.equals(ci.getName());
        }
        return false;
    }
    public int hashCode(){
        return name.hashCode();
    }
}
