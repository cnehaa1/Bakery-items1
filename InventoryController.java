package com.hexad.Bakery;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.repository.EMC_POOLINVENTORY_Repository;

import emc.example.model.*;

@RestController
public class InventoryController {
	
	
	private final Logger logger = LoggerFactory.getLogger(InventoryController.class);
	
	@Autowired
	EMC_POOLINVENTORY_Repository inventoryRepo;
	
	
	
	
	@RequestMapping("/getAllInventory")
    @ResponseBody
    public List<EMC_POOLINVENTORY> getAllInventory(){
    	logger.info("get all inventory method calling");
        return inventoryRepo.getAllInventory();
    }
    
    
    @RequestMapping("/getInventory")
    @ResponseBody
    public EMC_POOLINVENTORY getInventory(@RequestParam("poolinvid") int poolinvid){
        return inventoryRepo.getInventory(poolinvid);
    }
    
    
  

    //poolinvid , poolid,key
    @RequestMapping("/addInventory")
    @ResponseBody
    public String addItem(@RequestParam("poolinvid") int poolinvid,@RequestParam("poolid") int poolid,@RequestParam("key") String key
                            ){
        if(inventoryRepo.addInventory(poolinvid,poolid,key) >= 1){
            return "Item Added Successfully";
        }else{
            return "Something went wrong !";
        }
    }
	
	

}
