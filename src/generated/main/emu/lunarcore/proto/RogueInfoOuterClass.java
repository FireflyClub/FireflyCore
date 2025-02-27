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

public final class RogueInfoOuterClass {
  /**
   * Protobuf type {@code RogueInfo}
   */
  public static final class RogueInfo extends ProtoMessage<RogueInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .RogueCurrentInfo rogue_current_info = 607;</code>
     */
    private final RogueCurrentInfoOuterClass.RogueCurrentInfo rogueCurrentInfo = RogueCurrentInfoOuterClass.RogueCurrentInfo.newInstance();

    /**
     * <code>optional .RogueInfoData rogue_info_data = 683;</code>
     */
    private final RogueInfoDataOuterClass.RogueInfoData rogueInfoData = RogueInfoDataOuterClass.RogueInfoData.newInstance();

    private RogueInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueInfo}
     */
    public static RogueInfo newInstance() {
      return new RogueInfo();
    }

    /**
     * <code>optional .RogueCurrentInfo rogue_current_info = 607;</code>
     * @return whether the rogueCurrentInfo field is set
     */
    public boolean hasRogueCurrentInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .RogueCurrentInfo rogue_current_info = 607;</code>
     * @return this
     */
    public RogueInfo clearRogueCurrentInfo() {
      bitField0_ &= ~0x00000001;
      rogueCurrentInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueCurrentInfo rogue_current_info = 607;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueCurrentInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCurrentInfoOuterClass.RogueCurrentInfo getRogueCurrentInfo() {
      return rogueCurrentInfo;
    }

    /**
     * <code>optional .RogueCurrentInfo rogue_current_info = 607;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCurrentInfoOuterClass.RogueCurrentInfo getMutableRogueCurrentInfo() {
      bitField0_ |= 0x00000001;
      return rogueCurrentInfo;
    }

    /**
     * <code>optional .RogueCurrentInfo rogue_current_info = 607;</code>
     * @param value the rogueCurrentInfo to set
     * @return this
     */
    public RogueInfo setRogueCurrentInfo(final RogueCurrentInfoOuterClass.RogueCurrentInfo value) {
      bitField0_ |= 0x00000001;
      rogueCurrentInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueInfoData rogue_info_data = 683;</code>
     * @return whether the rogueInfoData field is set
     */
    public boolean hasRogueInfoData() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueInfoData rogue_info_data = 683;</code>
     * @return this
     */
    public RogueInfo clearRogueInfoData() {
      bitField0_ &= ~0x00000002;
      rogueInfoData.clear();
      return this;
    }

    /**
     * <code>optional .RogueInfoData rogue_info_data = 683;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueInfoData()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueInfoDataOuterClass.RogueInfoData getRogueInfoData() {
      return rogueInfoData;
    }

    /**
     * <code>optional .RogueInfoData rogue_info_data = 683;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueInfoDataOuterClass.RogueInfoData getMutableRogueInfoData() {
      bitField0_ |= 0x00000002;
      return rogueInfoData;
    }

    /**
     * <code>optional .RogueInfoData rogue_info_data = 683;</code>
     * @param value the rogueInfoData to set
     * @return this
     */
    public RogueInfo setRogueInfoData(final RogueInfoDataOuterClass.RogueInfoData value) {
      bitField0_ |= 0x00000002;
      rogueInfoData.copyFrom(value);
      return this;
    }

    @Override
    public RogueInfo copyFrom(final RogueInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rogueCurrentInfo.copyFrom(other.rogueCurrentInfo);
        rogueInfoData.copyFrom(other.rogueInfoData);
      }
      return this;
    }

    @Override
    public RogueInfo mergeFrom(final RogueInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRogueCurrentInfo()) {
        getMutableRogueCurrentInfo().mergeFrom(other.rogueCurrentInfo);
      }
      if (other.hasRogueInfoData()) {
        getMutableRogueInfoData().mergeFrom(other.rogueInfoData);
      }
      return this;
    }

    @Override
    public RogueInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueCurrentInfo.clear();
      rogueInfoData.clear();
      return this;
    }

    @Override
    public RogueInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueCurrentInfo.clearQuick();
      rogueInfoData.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueInfo)) {
        return false;
      }
      RogueInfo other = (RogueInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasRogueCurrentInfo() || rogueCurrentInfo.equals(other.rogueCurrentInfo))
        && (!hasRogueInfoData() || rogueInfoData.equals(other.rogueInfoData));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawLittleEndian16((short) 9722);
        output.writeMessageNoTag(rogueCurrentInfo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawLittleEndian16((short) 10970);
        output.writeMessageNoTag(rogueInfoData);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(rogueCurrentInfo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(rogueInfoData);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 4858: {
            // rogueCurrentInfo
            input.readMessage(rogueCurrentInfo);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 5466) {
              break;
            }
          }
          case 5466: {
            // rogueInfoData
            input.readMessage(rogueInfoData);
            bitField0_ |= 0x00000002;
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
        output.writeMessage(FieldNames.rogueCurrentInfo, rogueCurrentInfo);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.rogueInfoData, rogueInfoData);
      }
      output.endObject();
    }

    @Override
    public RogueInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -611905651:
          case 1279173113: {
            if (input.isAtField(FieldNames.rogueCurrentInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueCurrentInfo);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1486739086:
          case 480604278: {
            if (input.isAtField(FieldNames.rogueInfoData)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueInfoData);
                bitField0_ |= 0x00000002;
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
    public RogueInfo clone() {
      return new RogueInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueInfo(), data).checkInitialized();
    }

    public static RogueInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueInfo(), input).checkInitialized();
    }

    public static RogueInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueInfo messages
     */
    public static MessageFactory<RogueInfo> getFactory() {
      return RogueInfoFactory.INSTANCE;
    }

    private enum RogueInfoFactory implements MessageFactory<RogueInfo> {
      INSTANCE;

      @Override
      public RogueInfo create() {
        return RogueInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rogueCurrentInfo = FieldName.forField("rogueCurrentInfo", "rogue_current_info");

      static final FieldName rogueInfoData = FieldName.forField("rogueInfoData", "rogue_info_data");
    }
  }
}
