// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class RogueInfoDataOuterClass {
  /**
   * Protobuf type {@code RogueInfoData}
   */
  public static final class RogueInfoData extends ProtoMessage<RogueInfoData> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .RogueCurVirtualItemInfo rogue_virtual_item_info = 4;</code>
     */
    private final RogueCurVirtualItemInfoOuterClass.RogueCurVirtualItemInfo rogueVirtualItemInfo = RogueCurVirtualItemInfoOuterClass.RogueCurVirtualItemInfo.newInstance();

    /**
     * <code>optional .RogueScoreRewardInfo rogue_score_info = 10;</code>
     */
    private final RogueScoreRewardInfoOuterClass.RogueScoreRewardInfo rogueScoreInfo = RogueScoreRewardInfoOuterClass.RogueScoreRewardInfo.newInstance();

    /**
     * <code>optional .RogueAeonInfo rogue_aeon_info = 12;</code>
     */
    private final RogueAeonInfoOuterClass.RogueAeonInfo rogueAeonInfo = RogueAeonInfoOuterClass.RogueAeonInfo.newInstance();

    /**
     * <code>optional .RogueSeasonInfo rogue_season_info = 13;</code>
     */
    private final RogueSeasonInfoOuterClass.RogueSeasonInfo rogueSeasonInfo = RogueSeasonInfoOuterClass.RogueSeasonInfo.newInstance();

    /**
     * <code>optional .RogueAreaInfo rogue_area_info = 14;</code>
     */
    private final RogueAreaInfoOuterClass.RogueAreaInfo rogueAreaInfo = RogueAreaInfoOuterClass.RogueAreaInfo.newInstance();

    private RogueInfoData() {
    }

    /**
     * @return a new empty instance of {@code RogueInfoData}
     */
    public static RogueInfoData newInstance() {
      return new RogueInfoData();
    }

    /**
     * <code>optional .RogueCurVirtualItemInfo rogue_virtual_item_info = 4;</code>
     * @return whether the rogueVirtualItemInfo field is set
     */
    public boolean hasRogueVirtualItemInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .RogueCurVirtualItemInfo rogue_virtual_item_info = 4;</code>
     * @return this
     */
    public RogueInfoData clearRogueVirtualItemInfo() {
      bitField0_ &= ~0x00000001;
      rogueVirtualItemInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueCurVirtualItemInfo rogue_virtual_item_info = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueVirtualItemInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCurVirtualItemInfoOuterClass.RogueCurVirtualItemInfo getRogueVirtualItemInfo() {
      return rogueVirtualItemInfo;
    }

    /**
     * <code>optional .RogueCurVirtualItemInfo rogue_virtual_item_info = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCurVirtualItemInfoOuterClass.RogueCurVirtualItemInfo getMutableRogueVirtualItemInfo(
        ) {
      bitField0_ |= 0x00000001;
      return rogueVirtualItemInfo;
    }

    /**
     * <code>optional .RogueCurVirtualItemInfo rogue_virtual_item_info = 4;</code>
     * @param value the rogueVirtualItemInfo to set
     * @return this
     */
    public RogueInfoData setRogueVirtualItemInfo(
        final RogueCurVirtualItemInfoOuterClass.RogueCurVirtualItemInfo value) {
      bitField0_ |= 0x00000001;
      rogueVirtualItemInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueScoreRewardInfo rogue_score_info = 10;</code>
     * @return whether the rogueScoreInfo field is set
     */
    public boolean hasRogueScoreInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueScoreRewardInfo rogue_score_info = 10;</code>
     * @return this
     */
    public RogueInfoData clearRogueScoreInfo() {
      bitField0_ &= ~0x00000002;
      rogueScoreInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueScoreRewardInfo rogue_score_info = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueScoreInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueScoreRewardInfoOuterClass.RogueScoreRewardInfo getRogueScoreInfo() {
      return rogueScoreInfo;
    }

    /**
     * <code>optional .RogueScoreRewardInfo rogue_score_info = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueScoreRewardInfoOuterClass.RogueScoreRewardInfo getMutableRogueScoreInfo() {
      bitField0_ |= 0x00000002;
      return rogueScoreInfo;
    }

    /**
     * <code>optional .RogueScoreRewardInfo rogue_score_info = 10;</code>
     * @param value the rogueScoreInfo to set
     * @return this
     */
    public RogueInfoData setRogueScoreInfo(
        final RogueScoreRewardInfoOuterClass.RogueScoreRewardInfo value) {
      bitField0_ |= 0x00000002;
      rogueScoreInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueAeonInfo rogue_aeon_info = 12;</code>
     * @return whether the rogueAeonInfo field is set
     */
    public boolean hasRogueAeonInfo() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .RogueAeonInfo rogue_aeon_info = 12;</code>
     * @return this
     */
    public RogueInfoData clearRogueAeonInfo() {
      bitField0_ &= ~0x00000004;
      rogueAeonInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueAeonInfo rogue_aeon_info = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueAeonInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueAeonInfoOuterClass.RogueAeonInfo getRogueAeonInfo() {
      return rogueAeonInfo;
    }

    /**
     * <code>optional .RogueAeonInfo rogue_aeon_info = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueAeonInfoOuterClass.RogueAeonInfo getMutableRogueAeonInfo() {
      bitField0_ |= 0x00000004;
      return rogueAeonInfo;
    }

    /**
     * <code>optional .RogueAeonInfo rogue_aeon_info = 12;</code>
     * @param value the rogueAeonInfo to set
     * @return this
     */
    public RogueInfoData setRogueAeonInfo(final RogueAeonInfoOuterClass.RogueAeonInfo value) {
      bitField0_ |= 0x00000004;
      rogueAeonInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueSeasonInfo rogue_season_info = 13;</code>
     * @return whether the rogueSeasonInfo field is set
     */
    public boolean hasRogueSeasonInfo() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .RogueSeasonInfo rogue_season_info = 13;</code>
     * @return this
     */
    public RogueInfoData clearRogueSeasonInfo() {
      bitField0_ &= ~0x00000008;
      rogueSeasonInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueSeasonInfo rogue_season_info = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueSeasonInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueSeasonInfoOuterClass.RogueSeasonInfo getRogueSeasonInfo() {
      return rogueSeasonInfo;
    }

    /**
     * <code>optional .RogueSeasonInfo rogue_season_info = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueSeasonInfoOuterClass.RogueSeasonInfo getMutableRogueSeasonInfo() {
      bitField0_ |= 0x00000008;
      return rogueSeasonInfo;
    }

    /**
     * <code>optional .RogueSeasonInfo rogue_season_info = 13;</code>
     * @param value the rogueSeasonInfo to set
     * @return this
     */
    public RogueInfoData setRogueSeasonInfo(final RogueSeasonInfoOuterClass.RogueSeasonInfo value) {
      bitField0_ |= 0x00000008;
      rogueSeasonInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueAreaInfo rogue_area_info = 14;</code>
     * @return whether the rogueAreaInfo field is set
     */
    public boolean hasRogueAreaInfo() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .RogueAreaInfo rogue_area_info = 14;</code>
     * @return this
     */
    public RogueInfoData clearRogueAreaInfo() {
      bitField0_ &= ~0x00000010;
      rogueAreaInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueAreaInfo rogue_area_info = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueAreaInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueAreaInfoOuterClass.RogueAreaInfo getRogueAreaInfo() {
      return rogueAreaInfo;
    }

    /**
     * <code>optional .RogueAreaInfo rogue_area_info = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueAreaInfoOuterClass.RogueAreaInfo getMutableRogueAreaInfo() {
      bitField0_ |= 0x00000010;
      return rogueAreaInfo;
    }

    /**
     * <code>optional .RogueAreaInfo rogue_area_info = 14;</code>
     * @param value the rogueAreaInfo to set
     * @return this
     */
    public RogueInfoData setRogueAreaInfo(final RogueAreaInfoOuterClass.RogueAreaInfo value) {
      bitField0_ |= 0x00000010;
      rogueAreaInfo.copyFrom(value);
      return this;
    }

    @Override
    public RogueInfoData copyFrom(final RogueInfoData other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rogueVirtualItemInfo.copyFrom(other.rogueVirtualItemInfo);
        rogueScoreInfo.copyFrom(other.rogueScoreInfo);
        rogueAeonInfo.copyFrom(other.rogueAeonInfo);
        rogueSeasonInfo.copyFrom(other.rogueSeasonInfo);
        rogueAreaInfo.copyFrom(other.rogueAreaInfo);
      }
      return this;
    }

    @Override
    public RogueInfoData mergeFrom(final RogueInfoData other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRogueVirtualItemInfo()) {
        getMutableRogueVirtualItemInfo().mergeFrom(other.rogueVirtualItemInfo);
      }
      if (other.hasRogueScoreInfo()) {
        getMutableRogueScoreInfo().mergeFrom(other.rogueScoreInfo);
      }
      if (other.hasRogueAeonInfo()) {
        getMutableRogueAeonInfo().mergeFrom(other.rogueAeonInfo);
      }
      if (other.hasRogueSeasonInfo()) {
        getMutableRogueSeasonInfo().mergeFrom(other.rogueSeasonInfo);
      }
      if (other.hasRogueAreaInfo()) {
        getMutableRogueAreaInfo().mergeFrom(other.rogueAreaInfo);
      }
      return this;
    }

    @Override
    public RogueInfoData clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueVirtualItemInfo.clear();
      rogueScoreInfo.clear();
      rogueAeonInfo.clear();
      rogueSeasonInfo.clear();
      rogueAreaInfo.clear();
      return this;
    }

    @Override
    public RogueInfoData clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueVirtualItemInfo.clearQuick();
      rogueScoreInfo.clearQuick();
      rogueAeonInfo.clearQuick();
      rogueSeasonInfo.clearQuick();
      rogueAreaInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueInfoData)) {
        return false;
      }
      RogueInfoData other = (RogueInfoData) o;
      return bitField0_ == other.bitField0_
        && (!hasRogueVirtualItemInfo() || rogueVirtualItemInfo.equals(other.rogueVirtualItemInfo))
        && (!hasRogueScoreInfo() || rogueScoreInfo.equals(other.rogueScoreInfo))
        && (!hasRogueAeonInfo() || rogueAeonInfo.equals(other.rogueAeonInfo))
        && (!hasRogueSeasonInfo() || rogueSeasonInfo.equals(other.rogueSeasonInfo))
        && (!hasRogueAreaInfo() || rogueAreaInfo.equals(other.rogueAreaInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 34);
        output.writeMessageNoTag(rogueVirtualItemInfo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 82);
        output.writeMessageNoTag(rogueScoreInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(rogueAeonInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 106);
        output.writeMessageNoTag(rogueSeasonInfo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(rogueAreaInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueVirtualItemInfo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueScoreInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueAeonInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueSeasonInfo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueAreaInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueInfoData mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 34: {
            // rogueVirtualItemInfo
            input.readMessage(rogueVirtualItemInfo);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // rogueScoreInfo
            input.readMessage(rogueScoreInfo);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // rogueAeonInfo
            input.readMessage(rogueAeonInfo);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // rogueSeasonInfo
            input.readMessage(rogueSeasonInfo);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // rogueAreaInfo
            input.readMessage(rogueAreaInfo);
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeMessage(FieldNames.rogueVirtualItemInfo, rogueVirtualItemInfo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.rogueScoreInfo, rogueScoreInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.rogueAeonInfo, rogueAeonInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.rogueSeasonInfo, rogueSeasonInfo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeMessage(FieldNames.rogueAreaInfo, rogueAreaInfo);
      }
      output.endObject();
    }

    @Override
    public RogueInfoData mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1066755410:
          case 1452147457: {
            if (input.isAtField(FieldNames.rogueVirtualItemInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueVirtualItemInfo);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2078217638:
          case -208816704: {
            if (input.isAtField(FieldNames.rogueScoreInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueScoreInfo);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1685018549:
          case -1375922619: {
            if (input.isAtField(FieldNames.rogueAeonInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueAeonInfo);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1037341781:
          case -588845659: {
            if (input.isAtField(FieldNames.rogueSeasonInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueSeasonInfo);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 964297429:
          case -851505925: {
            if (input.isAtField(FieldNames.rogueAreaInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueAreaInfo);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public RogueInfoData clone() {
      return new RogueInfoData().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueInfoData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueInfoData(), data).checkInitialized();
    }

    public static RogueInfoData parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueInfoData(), input).checkInitialized();
    }

    public static RogueInfoData parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueInfoData(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueInfoData messages
     */
    public static MessageFactory<RogueInfoData> getFactory() {
      return RogueInfoDataFactory.INSTANCE;
    }

    private enum RogueInfoDataFactory implements MessageFactory<RogueInfoData> {
      INSTANCE;

      @Override
      public RogueInfoData create() {
        return RogueInfoData.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rogueVirtualItemInfo = FieldName.forField("rogueVirtualItemInfo", "rogue_virtual_item_info");

      static final FieldName rogueScoreInfo = FieldName.forField("rogueScoreInfo", "rogue_score_info");

      static final FieldName rogueAeonInfo = FieldName.forField("rogueAeonInfo", "rogue_aeon_info");

      static final FieldName rogueSeasonInfo = FieldName.forField("rogueSeasonInfo", "rogue_season_info");

      static final FieldName rogueAreaInfo = FieldName.forField("rogueAreaInfo", "rogue_area_info");
    }
  }
}
