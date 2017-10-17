package com.example.hywoman.a2a216230013;


public class ThemePark {
    private String tableName, enterTime, number, ticket, member, price;

             public ThemePark(String tableName, String enterTime) {
                this.tableName = tableName;
                 this.enterTime = enterTime;
             }

             public String getPrice() {
                 return price;
             }

             public void setPrice(String price) {
                 this.price = price;
             }

             public String getTableName() {
                 return tableName;
             }

             public String getEnterTime() {
                 return enterTime;
             }

             public String getNumber() {
                 return number;
             }

             public String getTicket() {
                return ticket;
             }

            public String getMember() {
                 return member;
             }

             public void setNumber(String number) {
               this.number = number;
             }

             public void setTicket(String ticket) {
                this.ticket = ticket;
             }

            public void setMember(String member) {
                this.member = member;
           }
}


