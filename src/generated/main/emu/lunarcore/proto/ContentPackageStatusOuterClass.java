// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import us.hebi.quickbuf.ProtoEnum;
import us.hebi.quickbuf.ProtoUtil;

public final class ContentPackageStatusOuterClass {
  /**
   * Protobuf enum {@code ContentPackageStatus}
   */
  public enum ContentPackageStatus implements ProtoEnum<ContentPackageStatus> {
    /**
     * <code>ContentPackageStatus_None = 0;</code>
     */
    ContentPackageStatus_None("ContentPackageStatus_None", 0),

    /**
     * <code>ContentPackageStatus_Init = 1;</code>
     */
    ContentPackageStatus_Init("ContentPackageStatus_Init", 1),

    /**
     * <code>ContentPackageStatus_Doing = 2;</code>
     */
    ContentPackageStatus_Doing("ContentPackageStatus_Doing", 2),

    /**
     * <code>ContentPackageStatus_Finished = 3;</code>
     */
    ContentPackageStatus_Finished("ContentPackageStatus_Finished", 3),

    /**
     * <code>ContentPackageStatus_Release = 4;</code>
     */
    ContentPackageStatus_Release("ContentPackageStatus_Release", 4);

    /**
     * <code>ContentPackageStatus_None = 0;</code>
     */
    public static final int ContentPackageStatus_None_VALUE = 0;

    /**
     * <code>ContentPackageStatus_Init = 1;</code>
     */
    public static final int ContentPackageStatus_Init_VALUE = 1;

    /**
     * <code>ContentPackageStatus_Doing = 2;</code>
     */
    public static final int ContentPackageStatus_Doing_VALUE = 2;

    /**
     * <code>ContentPackageStatus_Finished = 3;</code>
     */
    public static final int ContentPackageStatus_Finished_VALUE = 3;

    /**
     * <code>ContentPackageStatus_Release = 4;</code>
     */
    public static final int ContentPackageStatus_Release_VALUE = 4;

    private final String name;

    private final int number;

    private ContentPackageStatus(String name, int number) {
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
    public static ProtoEnum.EnumConverter<ContentPackageStatus> converter() {
      return ContentPackageStatusConverter.INSTANCE;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value, or null if unknown.
     */
    public static ContentPackageStatus forNumber(int value) {
      return ContentPackageStatusConverter.INSTANCE.forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @param other Fallback value in case the value is not known.
     * @return The enum associated with the given numeric wire value, or the fallback value if unknown.
     */
    public static ContentPackageStatus forNumberOr(int number, ContentPackageStatus other) {
      ContentPackageStatus value = forNumber(number);
      return value == null ? other : value;
    }

    enum ContentPackageStatusConverter implements ProtoEnum.EnumConverter<ContentPackageStatus> {
      INSTANCE;

      private static final ContentPackageStatus[] lookup = new ContentPackageStatus[5];

      static {
        lookup[0] = ContentPackageStatus_None;
        lookup[1] = ContentPackageStatus_Init;
        lookup[2] = ContentPackageStatus_Doing;
        lookup[3] = ContentPackageStatus_Finished;
        lookup[4] = ContentPackageStatus_Release;
      }

      @Override
      public final ContentPackageStatus forNumber(final int value) {
        if (value >= 0 && value < lookup.length) {
          return lookup[value];
        }
        return null;
      }

      @Override
      public final ContentPackageStatus forName(final CharSequence value) {
        switch (value.length()) {
          case 25: {
            if (ProtoUtil.isEqual("ContentPackageStatus_None", value)) {
              return ContentPackageStatus_None;
            }
            if (ProtoUtil.isEqual("ContentPackageStatus_Init", value)) {
              return ContentPackageStatus_Init;
            }
            break;
          }
          case 26: {
            if (ProtoUtil.isEqual("ContentPackageStatus_Doing", value)) {
              return ContentPackageStatus_Doing;
            }
            break;
          }
          case 28: {
            if (ProtoUtil.isEqual("ContentPackageStatus_Release", value)) {
              return ContentPackageStatus_Release;
            }
            break;
          }
          case 29: {
            if (ProtoUtil.isEqual("ContentPackageStatus_Finished", value)) {
              return ContentPackageStatus_Finished;
            }
            break;
          }
        }
        return null;
      }
    }
  }
}
