package org.example;

public class User {

        private String _name = null;
        //private Hand _newHand;

        public User(){

        }

        public User(String Name){

        }

        void setName(String name){
            _name = name;
        }

//        void setHand(Hand hand){
//            _newHand = hand;
//        }

        String getName(){
            return _name;
        }


}
