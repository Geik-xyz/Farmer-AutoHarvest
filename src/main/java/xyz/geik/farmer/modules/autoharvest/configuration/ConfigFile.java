package xyz.geik.farmer.modules.autoharvest.configuration;

import lombok.Getter;
import lombok.Setter;
import xyz.geik.glib.shades.okaeri.configs.OkaeriConfig;
import xyz.geik.glib.shades.okaeri.configs.annotation.Comment;
import xyz.geik.glib.shades.okaeri.configs.annotation.NameStrategy;
import xyz.geik.glib.shades.okaeri.configs.annotation.Names;

import java.util.Arrays;
import java.util.List;

/**
 * Modules file
 *
 * @author geik
 * @since 2.0
 */
@Getter
@Setter
@Names(strategy = NameStrategy.IDENTITY)
public class ConfigFile extends OkaeriConfig {

    @Comment({"auto harvest crops addon harvest crops automatically",
            "if you want this module to be enabled, you can set this to true"})
    private boolean status = false;

    @Comment({"if you want to make a little difficult to players, you can set this to true",
            "also it can do 1 check for each crop can impact performance small amount, but it can be a problem if you have a lot of crops",
            "if you set this to true, the crops will be harvested only if the piston is top direction of the crops",
            "if you set this to false, the crops will be harvested immediately even there is no piston"})
    private boolean requirePiston = false;

    @Comment({"this setting required requirePiston to be true to work",
            "recommended to set this to false if you have performance issues. (does 5 block check for each crop)",
            "if you set this to false, the crops will be harvested only if the piston is top direction of the crops",
            "if you set this to true, the crops will be harvested if the piston in any direction of the crops"})
    private boolean checkAllDirections = false;

    @Comment({"Harvest crops without farmer"})
    private boolean withoutFarmer = false;

    @Comment({"when stock is full, the crops cannot drop to ground",
            "recommended to set this to false if you have performance issues. (does 5 block check for each crop)",
            "if you set this to false, the crops will grow even if the stock is full.",
            "and the crops will be harvested and dropped on the ground."})
    private boolean checkStock = true;

    @Comment({"default value of autoharvest module"})
    private boolean defaultStatus = false;

    @Comment({"there is perm for use this module default: autoharvest.harvest"})
    private String customPerm = "farmer.autoharvest";

    @Comment({"write the crops you want to harvest here",
            "*IMPORTANT* Write only base item of crops. for example, if you want to harvest wheat, you must write WHEAT here",
            "if you want to harvest all crops, you must write all items here (*if you remove this setting, it can cause errors*)",
            "also you must write the crop names same as items.yml items.",
            "Available harvests: WHEAT, CARROT, POTATO, PUMPKIN, MELON, BEETROOT, NETHER_WART, SUGAR_CANE, COCOA_BEANS"})
    private List<String> items = Arrays.asList("WHEAT", "CARROT", "POTATO", "PUMPKIN");

}