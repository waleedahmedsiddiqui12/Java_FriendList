package com.was.friendlist;

import java.util.Collection;
import java.util.HashMap;

public class FriendsRespository implements IFriends<Friends>{
    
    private HashMap<String, Friends>  respository;

    public FriendsRespository(){
        respository = new HashMap<>();
        respository.put("1",new Friends("Waleed Ahmed Siddiqui", "Team Lead", 30));
        respository.put("2",new Friends("Zeeshan Jafri", "Laed Frontend Developer",29));
    }

    
    @Override
    public void save(Friends t) {
        respository.put(t.getName(),t);

    }

    @Override
    public Collection<Friends> viewAll() {
        return respository.values();
    }   

    @Override
    public void update(Friends t) {
        
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override public void delete (Friends t){
    throw new UnsupportedOperationException("Unimplemented method '_'");}


    public HashMap<String, Friends> getRespository() {
        return respository;
    }


    public void setRespository(HashMap<String, Friends> respository) {
        this.respository = respository;
    }
}
