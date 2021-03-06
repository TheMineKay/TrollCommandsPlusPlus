package me.egg82.tcpp.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.CommandHelp;
import co.aikar.commands.annotation.*;
import co.aikar.taskchain.TaskChainFactory;
import me.egg82.tcpp.commands.internal.*;
import me.egg82.tcpp.utils.LogUtil;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

@CommandAlias("trollcommandsplusplus|troll|t")
public class TrollCommand extends BaseCommand {
    private final Plugin plugin;
    private final TaskChainFactory taskFactory;

    public TrollCommand(Plugin plugin, TaskChainFactory taskFactory) {
        this.plugin = plugin;
        this.taskFactory = taskFactory;
    }

    @Subcommand("reload")
    @CommandPermission("tcpp.admin")
    @Description("Reloads the plugin.")
    public void onReload(CommandSender sender) {
        new ReloadCommand(plugin, taskFactory.newChain(), sender).run();
    }

    @CatchUnknown @Default
    @CommandCompletion("@subcommand")
    public void onDefault(CommandSender sender, String[] args) {
        Bukkit.getServer().dispatchCommand(sender, "trollcommandsplusplus help");
    }

    @Subcommand("alone")
    @CommandPermission("tcpp.command.alone")
    @Description("(Toggleable) Hides all other players from the specified player.")
    @Syntax("<player>")
    @CommandCompletion("@player")
    public void onAlone(CommandSender sender, String playerName) {
        new AloneCommand(plugin, taskFactory.newChain(), sender, playerName).run();
    }

    @Subcommand("amnesia")
    @CommandPermission("tcpp.command.amnesia")
    @Description("(Toggleable) Screws with the player's chat in weird ways.")
    @Syntax("<player>")
    @CommandCompletion("@player")
    public void onAmnesia(CommandSender sender, String playerName) {
        new AmnesiaCommand(taskFactory.newChain(), sender, playerName).run();
    }

    @Subcommand("annoy")
    @CommandPermission("tcpp.command.annoy")
    @Description("(Toggleable) Hrmm. Hmm.. Hrrm.. Hrm. Hm. Hmm..")
    @Syntax("<player>")
    @CommandCompletion("@player")
    public void onAnnoy(CommandSender sender, String playerName) {
        new AnnoyCommand(taskFactory.newChain(), sender, playerName).run();
    }

    @Subcommand("anvil")
    @CommandPermission("tcpp.command.anvil")
    @Description("Now who could have put that up there?")
    @Syntax("<player>")
    @CommandCompletion("@player")
    public void onAnvil(CommandSender sender, String playerName) {
        new AnvilCommand(plugin, taskFactory.newChain(), sender, playerName).run();
    }

    @Subcommand("attach")
    @CommandPermission("tcpp.command.attach")
    @Description("(Undoable) The specified command (topic) will be attached to an item. The next time this item is picked up, it will run the command as the payer that picked the item up..")
    @Syntax("[topic]")
    @CommandCompletion("@topic")
    public void onAttach(CommandSender sender, @Default() String[] topic) {
        if (Bukkit.getPluginManager().getPlugin("ProtocolLib") == null) {
            sender.sendMessage(LogUtil.getHeading() + ChatColor.DARK_RED + "This command requires ProtocolLib!");
        }

        new AttachCommand(sender, topic).run();
    }

    @Subcommand("banish")
    @CommandPermission("tcpp.command.banish")
    @Description("Teleports the player to a random location.")
    @Syntax("<player> [range]")
    @CommandCompletion("@player")
    public void onBanish(CommandSender sender, String playerName, @Default("5000") long range) {
        new BanishCommand(taskFactory.newChain(), sender, playerName, range).run();
    }

    @Subcommand("bludger")
    @CommandPermission("tcpp.command.bludger")
    @Description("(Toggleable) That's been tampered with, that has! (Removed on quit, death, or explode)")
    @Syntax("<player>")
    @CommandCompletion("@player")
    public void onBludger(CommandSender sender, String playerName) {
        new BludgerCommand(taskFactory.newChain(), sender, playerName).run();
    }

    @Subcommand("bomb")
    @CommandPermission("tcpp.command.bomb")
    @Description("(Toggleable) May balls of fire rain down upon thine enemy. (Removed on death)")
    @Syntax("<player>")
    @CommandCompletion("@player")
    public void onBomb(CommandSender sender, String playerName) {
        new BombCommand(taskFactory.newChain(), sender, playerName).run();
    }

    @Subcommand("brittle")
    @CommandPermission("tcpp.command.brittle")
    @Description("(Toggleable) They're made of glass! (Removed on death)")
    @Syntax("<player>")
    @CommandCompletion("@player")
    public void onBrittle(CommandSender sender, String playerName) {
        new BrittleCommand(taskFactory.newChain(), sender, playerName).run();
    }

    @Subcommand("burn")
    @CommandPermission("tcpp.command.burn")
    @Description("(Toggleable) AHH! FIRE! FIRE! FIIREE!! (Removed on death)")
    @Syntax("<player>")
    @CommandCompletion("@player")
    public void onBurn(CommandSender sender, String playerName) {
        new BurnCommand(taskFactory.newChain(), sender, playerName).run();
    }

    @Subcommand("cannon")
    @CommandPermission("tcpp.command.cannon")
    @Description("Shoots a primed TNT wherever you're looking of adjustable speed and power.")
    @Syntax("[speed] [power]")
    public void onBanish(CommandSender sender, @Default("2.0") double speed, @Default("1.0") double power) {
        new CannonCommand(sender, speed, power).run();
    }

    @Subcommand("stop")
    @CommandPermission("tcpp.command.stop")
    @Description("Stops and undoes any currently-active trolls against the player.")
    @Syntax("<player>")
    @CommandCompletion("@player")
    public void onStop(CommandSender sender, String playerName) {
        new StopCommand(taskFactory.newChain(), sender, playerName).run();
    }

    @HelpCommand
    @Syntax("[command]")
    public void onHelp(CommandSender sender, CommandHelp help) { help.showHelp(); }
}
