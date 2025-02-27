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

public final class ChessRogueRollDiceScRspOuterClass {
  /**
   * Protobuf type {@code ChessRogueRollDiceScRsp}
   */
  public static final class ChessRogueRollDiceScRsp extends ProtoMessage<ChessRogueRollDiceScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 JDHBHNMPIPI = 1;</code>
     */
    private int jDHBHNMPIPI;

    /**
     * <code>optional uint32 retcode = 10;</code>
     */
    private int retcode;

    /**
     * <code>optional .ChessRogueNousDice nous_dice = 12;</code>
     */
    private final ChessRogueNousDiceOuterClass.ChessRogueNousDice nousDice = ChessRogueNousDiceOuterClass.ChessRogueNousDice.newInstance();

    private ChessRogueRollDiceScRsp() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueRollDiceScRsp}
     */
    public static ChessRogueRollDiceScRsp newInstance() {
      return new ChessRogueRollDiceScRsp();
    }

    /**
     * <code>optional uint32 JDHBHNMPIPI = 1;</code>
     * @return whether the jDHBHNMPIPI field is set
     */
    public boolean hasJDHBHNMPIPI() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 JDHBHNMPIPI = 1;</code>
     * @return this
     */
    public ChessRogueRollDiceScRsp clearJDHBHNMPIPI() {
      bitField0_ &= ~0x00000001;
      jDHBHNMPIPI = 0;
      return this;
    }

    /**
     * <code>optional uint32 JDHBHNMPIPI = 1;</code>
     * @return the jDHBHNMPIPI
     */
    public int getJDHBHNMPIPI() {
      return jDHBHNMPIPI;
    }

    /**
     * <code>optional uint32 JDHBHNMPIPI = 1;</code>
     * @param value the jDHBHNMPIPI to set
     * @return this
     */
    public ChessRogueRollDiceScRsp setJDHBHNMPIPI(final int value) {
      bitField0_ |= 0x00000001;
      jDHBHNMPIPI = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return this
     */
    public ChessRogueRollDiceScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @param value the retcode to set
     * @return this
     */
    public ChessRogueRollDiceScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .ChessRogueNousDice nous_dice = 12;</code>
     * @return whether the nousDice field is set
     */
    public boolean hasNousDice() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .ChessRogueNousDice nous_dice = 12;</code>
     * @return this
     */
    public ChessRogueRollDiceScRsp clearNousDice() {
      bitField0_ &= ~0x00000004;
      nousDice.clear();
      return this;
    }

    /**
     * <code>optional .ChessRogueNousDice nous_dice = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableNousDice()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChessRogueNousDiceOuterClass.ChessRogueNousDice getNousDice() {
      return nousDice;
    }

    /**
     * <code>optional .ChessRogueNousDice nous_dice = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueNousDiceOuterClass.ChessRogueNousDice getMutableNousDice() {
      bitField0_ |= 0x00000004;
      return nousDice;
    }

    /**
     * <code>optional .ChessRogueNousDice nous_dice = 12;</code>
     * @param value the nousDice to set
     * @return this
     */
    public ChessRogueRollDiceScRsp setNousDice(
        final ChessRogueNousDiceOuterClass.ChessRogueNousDice value) {
      bitField0_ |= 0x00000004;
      nousDice.copyFrom(value);
      return this;
    }

    @Override
    public ChessRogueRollDiceScRsp copyFrom(final ChessRogueRollDiceScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        jDHBHNMPIPI = other.jDHBHNMPIPI;
        retcode = other.retcode;
        nousDice.copyFrom(other.nousDice);
      }
      return this;
    }

    @Override
    public ChessRogueRollDiceScRsp mergeFrom(final ChessRogueRollDiceScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasJDHBHNMPIPI()) {
        setJDHBHNMPIPI(other.jDHBHNMPIPI);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasNousDice()) {
        getMutableNousDice().mergeFrom(other.nousDice);
      }
      return this;
    }

    @Override
    public ChessRogueRollDiceScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      jDHBHNMPIPI = 0;
      retcode = 0;
      nousDice.clear();
      return this;
    }

    @Override
    public ChessRogueRollDiceScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      nousDice.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueRollDiceScRsp)) {
        return false;
      }
      ChessRogueRollDiceScRsp other = (ChessRogueRollDiceScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasJDHBHNMPIPI() || jDHBHNMPIPI == other.jDHBHNMPIPI)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasNousDice() || nousDice.equals(other.nousDice));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(jDHBHNMPIPI);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(nousDice);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(jDHBHNMPIPI);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(nousDice);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueRollDiceScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // jDHBHNMPIPI
            jDHBHNMPIPI = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // nousDice
            input.readMessage(nousDice);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.jDHBHNMPIPI, jDHBHNMPIPI);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.nousDice, nousDice);
      }
      output.endObject();
    }

    @Override
    public ChessRogueRollDiceScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -752371707: {
            if (input.isAtField(FieldNames.jDHBHNMPIPI)) {
              if (!input.trySkipNullValue()) {
                jDHBHNMPIPI = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1622214758:
          case -1226158137: {
            if (input.isAtField(FieldNames.nousDice)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(nousDice);
                bitField0_ |= 0x00000004;
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
    public ChessRogueRollDiceScRsp clone() {
      return new ChessRogueRollDiceScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueRollDiceScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueRollDiceScRsp(), data).checkInitialized();
    }

    public static ChessRogueRollDiceScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueRollDiceScRsp(), input).checkInitialized();
    }

    public static ChessRogueRollDiceScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueRollDiceScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueRollDiceScRsp messages
     */
    public static MessageFactory<ChessRogueRollDiceScRsp> getFactory() {
      return ChessRogueRollDiceScRspFactory.INSTANCE;
    }

    private enum ChessRogueRollDiceScRspFactory implements MessageFactory<ChessRogueRollDiceScRsp> {
      INSTANCE;

      @Override
      public ChessRogueRollDiceScRsp create() {
        return ChessRogueRollDiceScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName jDHBHNMPIPI = FieldName.forField("JDHBHNMPIPI");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName nousDice = FieldName.forField("nousDice", "nous_dice");
    }
  }
}
