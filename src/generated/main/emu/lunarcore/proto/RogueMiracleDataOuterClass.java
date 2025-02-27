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

public final class RogueMiracleDataOuterClass {
  /**
   * Protobuf type {@code RogueMiracleData}
   */
  public static final class RogueMiracleData extends ProtoMessage<RogueMiracleData> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .RogueMiracle rogue_miracle = 10;</code>
     */
    private final RogueMiracleOuterClass.RogueMiracle rogueMiracle = RogueMiracleOuterClass.RogueMiracle.newInstance();

    private RogueMiracleData() {
    }

    /**
     * @return a new empty instance of {@code RogueMiracleData}
     */
    public static RogueMiracleData newInstance() {
      return new RogueMiracleData();
    }

    /**
     * <code>optional .RogueMiracle rogue_miracle = 10;</code>
     * @return whether the rogueMiracle field is set
     */
    public boolean hasRogueMiracle() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .RogueMiracle rogue_miracle = 10;</code>
     * @return this
     */
    public RogueMiracleData clearRogueMiracle() {
      bitField0_ &= ~0x00000001;
      rogueMiracle.clear();
      return this;
    }

    /**
     * <code>optional .RogueMiracle rogue_miracle = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueMiracle()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueMiracleOuterClass.RogueMiracle getRogueMiracle() {
      return rogueMiracle;
    }

    /**
     * <code>optional .RogueMiracle rogue_miracle = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueMiracleOuterClass.RogueMiracle getMutableRogueMiracle() {
      bitField0_ |= 0x00000001;
      return rogueMiracle;
    }

    /**
     * <code>optional .RogueMiracle rogue_miracle = 10;</code>
     * @param value the rogueMiracle to set
     * @return this
     */
    public RogueMiracleData setRogueMiracle(final RogueMiracleOuterClass.RogueMiracle value) {
      bitField0_ |= 0x00000001;
      rogueMiracle.copyFrom(value);
      return this;
    }

    @Override
    public RogueMiracleData copyFrom(final RogueMiracleData other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rogueMiracle.copyFrom(other.rogueMiracle);
      }
      return this;
    }

    @Override
    public RogueMiracleData mergeFrom(final RogueMiracleData other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRogueMiracle()) {
        getMutableRogueMiracle().mergeFrom(other.rogueMiracle);
      }
      return this;
    }

    @Override
    public RogueMiracleData clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueMiracle.clear();
      return this;
    }

    @Override
    public RogueMiracleData clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueMiracle.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueMiracleData)) {
        return false;
      }
      RogueMiracleData other = (RogueMiracleData) o;
      return bitField0_ == other.bitField0_
        && (!hasRogueMiracle() || rogueMiracle.equals(other.rogueMiracle));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 82);
        output.writeMessageNoTag(rogueMiracle);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueMiracle);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueMiracleData mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 82: {
            // rogueMiracle
            input.readMessage(rogueMiracle);
            bitField0_ |= 0x00000001;
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
        output.writeMessage(FieldNames.rogueMiracle, rogueMiracle);
      }
      output.endObject();
    }

    @Override
    public RogueMiracleData mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1479551689:
          case 1697369868: {
            if (input.isAtField(FieldNames.rogueMiracle)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueMiracle);
                bitField0_ |= 0x00000001;
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
    public RogueMiracleData clone() {
      return new RogueMiracleData().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueMiracleData parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueMiracleData(), data).checkInitialized();
    }

    public static RogueMiracleData parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueMiracleData(), input).checkInitialized();
    }

    public static RogueMiracleData parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueMiracleData(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueMiracleData messages
     */
    public static MessageFactory<RogueMiracleData> getFactory() {
      return RogueMiracleDataFactory.INSTANCE;
    }

    private enum RogueMiracleDataFactory implements MessageFactory<RogueMiracleData> {
      INSTANCE;

      @Override
      public RogueMiracleData create() {
        return RogueMiracleData.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rogueMiracle = FieldName.forField("rogueMiracle", "rogue_miracle");
    }
  }
}
