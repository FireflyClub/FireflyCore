// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import us.hebi.quickbuf.ProtoEnum;
import us.hebi.quickbuf.ProtoUtil;

public final class ExtraLineupTypeOuterClass {
  /**
   * Protobuf enum {@code ExtraLineupType}
   */
  public enum ExtraLineupType implements ProtoEnum<ExtraLineupType> {
    /**
     * <code>LINEUP_NONE = 0;</code>
     */
    LINEUP_NONE("LINEUP_NONE", 0),

    /**
     * <code>LINEUP_CHALLENGE = 1;</code>
     */
    LINEUP_CHALLENGE("LINEUP_CHALLENGE", 1),

    /**
     * <code>LINEUP_ROGUE = 2;</code>
     */
    LINEUP_ROGUE("LINEUP_ROGUE", 2),

    /**
     * <code>LINEUP_CHALLENGE_2 = 3;</code>
     */
    LINEUP_CHALLENGE_2("LINEUP_CHALLENGE_2", 3),

    /**
     * <code>LINEUP_CHALLENGE_3 = 4;</code>
     */
    LINEUP_CHALLENGE_3("LINEUP_CHALLENGE_3", 4),

    /**
     * <code>LINEUP_ROGUE_CHALLENGE = 5;</code>
     */
    LINEUP_ROGUE_CHALLENGE("LINEUP_ROGUE_CHALLENGE", 5),

    /**
     * <code>LINEUP_STAGE_TRIAL = 6;</code>
     */
    LINEUP_STAGE_TRIAL("LINEUP_STAGE_TRIAL", 6),

    /**
     * <code>LINEUP_ROGUE_TRIAL = 7;</code>
     */
    LINEUP_ROGUE_TRIAL("LINEUP_ROGUE_TRIAL", 7),

    /**
     * <code>LINEUP_ACTIVITY = 8;</code>
     */
    LINEUP_ACTIVITY("LINEUP_ACTIVITY", 8),

    /**
     * <code>LINEUP_BOXING_CLUB = 9;</code>
     */
    LINEUP_BOXING_CLUB("LINEUP_BOXING_CLUB", 9),

    /**
     * <code>LINEUP_TREASURE_DUNGEON = 11;</code>
     */
    LINEUP_TREASURE_DUNGEON("LINEUP_TREASURE_DUNGEON", 11),

    /**
     * <code>LINEUP_CHESS_ROGUE = 12;</code>
     */
    LINEUP_CHESS_ROGUE("LINEUP_CHESS_ROGUE", 12),

    /**
     * <code>LINEUP_HELIOBUS = 13;</code>
     */
    LINEUP_HELIOBUS("LINEUP_HELIOBUS", 13),

    /**
     * <code>LINEUP_TOURN_ROGUE = 14;</code>
     */
    LINEUP_TOURN_ROGUE("LINEUP_TOURN_ROGUE", 14),

    /**
     * <code>LINEUP_RELIC_ROGUE = 15;</code>
     */
    LINEUP_RELIC_ROGUE("LINEUP_RELIC_ROGUE", 15),

    /**
     * <code>LINEUP_ARCADE_ROGUE = 16;</code>
     */
    LINEUP_ARCADE_ROGUE("LINEUP_ARCADE_ROGUE", 16),

    /**
     * <code>LINEUP_MAGIC_ROGUE = 17;</code>
     */
    LINEUP_MAGIC_ROGUE("LINEUP_MAGIC_ROGUE", 17);

    /**
     * <code>LINEUP_NONE = 0;</code>
     */
    public static final int LINEUP_NONE_VALUE = 0;

    /**
     * <code>LINEUP_CHALLENGE = 1;</code>
     */
    public static final int LINEUP_CHALLENGE_VALUE = 1;

    /**
     * <code>LINEUP_ROGUE = 2;</code>
     */
    public static final int LINEUP_ROGUE_VALUE = 2;

    /**
     * <code>LINEUP_CHALLENGE_2 = 3;</code>
     */
    public static final int LINEUP_CHALLENGE_2_VALUE = 3;

    /**
     * <code>LINEUP_CHALLENGE_3 = 4;</code>
     */
    public static final int LINEUP_CHALLENGE_3_VALUE = 4;

    /**
     * <code>LINEUP_ROGUE_CHALLENGE = 5;</code>
     */
    public static final int LINEUP_ROGUE_CHALLENGE_VALUE = 5;

    /**
     * <code>LINEUP_STAGE_TRIAL = 6;</code>
     */
    public static final int LINEUP_STAGE_TRIAL_VALUE = 6;

    /**
     * <code>LINEUP_ROGUE_TRIAL = 7;</code>
     */
    public static final int LINEUP_ROGUE_TRIAL_VALUE = 7;

    /**
     * <code>LINEUP_ACTIVITY = 8;</code>
     */
    public static final int LINEUP_ACTIVITY_VALUE = 8;

    /**
     * <code>LINEUP_BOXING_CLUB = 9;</code>
     */
    public static final int LINEUP_BOXING_CLUB_VALUE = 9;

    /**
     * <code>LINEUP_TREASURE_DUNGEON = 11;</code>
     */
    public static final int LINEUP_TREASURE_DUNGEON_VALUE = 11;

    /**
     * <code>LINEUP_CHESS_ROGUE = 12;</code>
     */
    public static final int LINEUP_CHESS_ROGUE_VALUE = 12;

    /**
     * <code>LINEUP_HELIOBUS = 13;</code>
     */
    public static final int LINEUP_HELIOBUS_VALUE = 13;

    /**
     * <code>LINEUP_TOURN_ROGUE = 14;</code>
     */
    public static final int LINEUP_TOURN_ROGUE_VALUE = 14;

    /**
     * <code>LINEUP_RELIC_ROGUE = 15;</code>
     */
    public static final int LINEUP_RELIC_ROGUE_VALUE = 15;

    /**
     * <code>LINEUP_ARCADE_ROGUE = 16;</code>
     */
    public static final int LINEUP_ARCADE_ROGUE_VALUE = 16;

    /**
     * <code>LINEUP_MAGIC_ROGUE = 17;</code>
     */
    public static final int LINEUP_MAGIC_ROGUE_VALUE = 17;

    private final String name;

    private final int number;

    private ExtraLineupType(String name, int number) {
      this.name = name;
      this.number = number;
    }

    /**
     * @return the string representation of enum entry
     */
    @Override
    public String getName() {
      return name;
    }

    /**
     * @return the numeric wire value of this enum entry
     */
    @Override
    public int getNumber() {
      return number;
    }

    /**
     * @return a converter that maps between this enum's numeric and text representations
     */
    public static ProtoEnum.EnumConverter<ExtraLineupType> converter() {
      return ExtraLineupTypeConverter.INSTANCE;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value, or null if unknown.
     */
    public static ExtraLineupType forNumber(int value) {
      return ExtraLineupTypeConverter.INSTANCE.forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @param other Fallback value in case the value is not known.
     * @return The enum associated with the given numeric wire value, or the fallback value if unknown.
     */
    public static ExtraLineupType forNumberOr(int number, ExtraLineupType other) {
      ExtraLineupType value = forNumber(number);
      return value == null ? other : value;
    }

    enum ExtraLineupTypeConverter implements ProtoEnum.EnumConverter<ExtraLineupType> {
      INSTANCE;

      private static final ExtraLineupType[] lookup = new ExtraLineupType[18];

      static {
        lookup[0] = LINEUP_NONE;
        lookup[1] = LINEUP_CHALLENGE;
        lookup[2] = LINEUP_ROGUE;
        lookup[3] = LINEUP_CHALLENGE_2;
        lookup[4] = LINEUP_CHALLENGE_3;
        lookup[5] = LINEUP_ROGUE_CHALLENGE;
        lookup[6] = LINEUP_STAGE_TRIAL;
        lookup[7] = LINEUP_ROGUE_TRIAL;
        lookup[8] = LINEUP_ACTIVITY;
        lookup[9] = LINEUP_BOXING_CLUB;
        lookup[11] = LINEUP_TREASURE_DUNGEON;
        lookup[12] = LINEUP_CHESS_ROGUE;
        lookup[13] = LINEUP_HELIOBUS;
        lookup[14] = LINEUP_TOURN_ROGUE;
        lookup[15] = LINEUP_RELIC_ROGUE;
        lookup[16] = LINEUP_ARCADE_ROGUE;
        lookup[17] = LINEUP_MAGIC_ROGUE;
      }

      @Override
      public final ExtraLineupType forNumber(final int value) {
        if (value >= 0 && value < lookup.length) {
          return lookup[value];
        }
        return null;
      }

      @Override
      public final ExtraLineupType forName(final CharSequence value) {
        switch (value.length()) {
          case 11: {
            if (ProtoUtil.isEqual("LINEUP_NONE", value)) {
              return LINEUP_NONE;
            }
            break;
          }
          case 12: {
            if (ProtoUtil.isEqual("LINEUP_ROGUE", value)) {
              return LINEUP_ROGUE;
            }
            break;
          }
          case 15: {
            if (ProtoUtil.isEqual("LINEUP_ACTIVITY", value)) {
              return LINEUP_ACTIVITY;
            }
            if (ProtoUtil.isEqual("LINEUP_HELIOBUS", value)) {
              return LINEUP_HELIOBUS;
            }
            break;
          }
          case 16: {
            if (ProtoUtil.isEqual("LINEUP_CHALLENGE", value)) {
              return LINEUP_CHALLENGE;
            }
            break;
          }
          case 18: {
            if (ProtoUtil.isEqual("LINEUP_CHALLENGE_2", value)) {
              return LINEUP_CHALLENGE_2;
            }
            if (ProtoUtil.isEqual("LINEUP_CHALLENGE_3", value)) {
              return LINEUP_CHALLENGE_3;
            }
            if (ProtoUtil.isEqual("LINEUP_STAGE_TRIAL", value)) {
              return LINEUP_STAGE_TRIAL;
            }
            if (ProtoUtil.isEqual("LINEUP_ROGUE_TRIAL", value)) {
              return LINEUP_ROGUE_TRIAL;
            }
            if (ProtoUtil.isEqual("LINEUP_BOXING_CLUB", value)) {
              return LINEUP_BOXING_CLUB;
            }
            if (ProtoUtil.isEqual("LINEUP_CHESS_ROGUE", value)) {
              return LINEUP_CHESS_ROGUE;
            }
            if (ProtoUtil.isEqual("LINEUP_TOURN_ROGUE", value)) {
              return LINEUP_TOURN_ROGUE;
            }
            if (ProtoUtil.isEqual("LINEUP_RELIC_ROGUE", value)) {
              return LINEUP_RELIC_ROGUE;
            }
            if (ProtoUtil.isEqual("LINEUP_MAGIC_ROGUE", value)) {
              return LINEUP_MAGIC_ROGUE;
            }
            break;
          }
          case 19: {
            if (ProtoUtil.isEqual("LINEUP_ARCADE_ROGUE", value)) {
              return LINEUP_ARCADE_ROGUE;
            }
            break;
          }
          case 22: {
            if (ProtoUtil.isEqual("LINEUP_ROGUE_CHALLENGE", value)) {
              return LINEUP_ROGUE_CHALLENGE;
            }
            break;
          }
          case 23: {
            if (ProtoUtil.isEqual("LINEUP_TREASURE_DUNGEON", value)) {
              return LINEUP_TREASURE_DUNGEON;
            }
            break;
          }
        }
        return null;
      }
    }
  }
}
