import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.DFA;

class bNo extends DFA
{
  public bNo(ee paramee, BaseRecognizer paramBaseRecognizer)
  {
    this.recognizer = paramBaseRecognizer;
    this.decisionNumber = 77;
    this.eot = ee.abx;
    this.eof = ee.aby;
    this.min = ee.abz;
    this.max = ee.abA;
    this.accept = ee.abB;
    this.special = ee.abC;
    this.transition = ee.abD;
  }

  public String getDescription() {
    return "847:1: cmd returns [ModerationCommand cmd] : (c= stats_cmd |c= panel_cmd |c= ping_cmd |c= who_cmd |c= where_cmd |c= teleport_to_player_cmd |c= teleport_to_coords_cmd |c= teleport_to_inst_cmd |c= teleport_player_to_me_cmd |c= teleport_player_to_coords_cmd |c= teleport_player_to_instance_cmd |c= serverlock_cmd |c= kick_cmd |c= ban_cmd |c= ghostcheck_cmd |c= identphase_cmd |c= shutdown_cmd |c= sysmsg_cmd |c= msgall_cmd |c= symbiot_cmd |c= nation_cmd |c= achievement_cmd |c= achievement_date_cmd |c= zone_buff_cmd |c= create_group_cmd |c= add_to_group_cmd |c= rights_cmd |c= chaos_cmd |c= restart_chaos_cmd |c= create_item_cmd |c= create_set_cmd |c= delete_item_cmd |c= regenerate_cmd |c= regenerate_with_item_cmd |c= turn_duration_cmd |c= run_action_cmd |c= end_scenario_cmd |c= reload_scenarios_cmd |c= add_spellxp_cmd |c= set_spelllevel_cmd |c= add_skillxp_cmd |c= set_skill_level_cmd |c= add_xp_cmd |c= set_bonus_factor_cmd |c= add_money_cmd |c= help_cmd |c= god_mode_cmd |c= instance_usage_cmd |c= destroy_instance_cmd |c= show_aggro_list_cmd |c= play_animation_cmd |c= play_aps_cmd |c= set_level_cmd |c= spawn_ie_cmd |c= sessions_cmd |c= set_next_challenge_cmd |c= finish_challenge_cmd |c= staff_cmd |c= subscriber_cmd |c= mute_partitions_cmd |c= unmute_partitions_cmd |c= mute_cmd |c= unmute_cmd |c= distribute_items_cmd |c= search_cmd |c= give_rights_cmd |c= remove_rights_cmd |c= teleport_to_breed_mob_cmd |c= buff_character_cmd |c= quota_cmd |c= ragnarok_cmd |c= remove_floor_items_cmd |c= show_population_cmd |c= show_monster_quota_cmd |c= cancel_collect_cooldown_cmd |c= get_instance_uid_cmd |c= dump_bag_cmd |c= set_wakfu_gauge_cmd |c= temp_cmd |c= calendar_cmd |c= fight_cmd |c= protector_command |c= monster_group |c= set_resource_speed_factor |c= state_command |c= scenario_cmd |c= version_cmd |c= plant_resources_cmd |c= destroy_resources_cmd |c= destroy_monsters_cmd |c= set_respawn_cmd |c= check_cmd |c= craft_cmd |c= ban_request_cmd |c= ice_status_cmd |c= pet_cmd |c= add_itemxp_cmd |c= guild_cmd |c= spell_command |c= gem_command |c= aptitude_command |c= havenworld_cmd |c= almanach_start_cmd |c= learn_emote_cmd |c= set_player_title_cmd |c= free_access_cmd |c= create_full_group_cmd |c= inventory_cmd |c= empty_char_cmd |c= gameplay_stats_cmd |c= client_game_event_command |c= rent_item_cmd |c= character_cmd );";
  }
}