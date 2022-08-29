package kr.co.crp.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ItemCRUD {

    //domain
    @Data @AllArgsConstructor
    static class Item{
        private int id;
        private String name;
        private int price;


    }

    //controller
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ItemService service = new ItemServiceImpl();

    }

    //service
    interface ItemService{

    }

    static class ItemServiceImpl implements ItemService{
        private final Map<String, Item> map;

        ItemServiceImpl() {this.map = new HashMap<>();}

    }

}
