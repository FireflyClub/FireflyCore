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

public final class RotateMapScRspOuterClass {
  /**
   * Protobuf type {@code RotateMapScRsp}
   */
  public static final class RotateMapScRsp extends ProtoMessage<RotateMapScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 8;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 client_pos_version = 14;</code>
     */
    private int clientPosVersion;

    /**
     * <code>optional .MotionInfo motion = 5;</code>
     */
    private final MotionInfoOuterClass.MotionInfo motion = MotionInfoOuterClass.MotionInfo.newInstance();

    private RotateMapScRsp() {
    }

    /**
     * @return a new empty instance of {@code RotateMapScRsp}
     */
    public static RotateMapScRsp newInstance() {
      return new RotateMapScRsp();
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return this
     */
    public RotateMapScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @param value the retcode to set
     * @return this
     */
    public RotateMapScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 client_pos_version = 14;</code>
     * @return whether the clientPosVersion field is set
     */
    public boolean hasClientPosVersion() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 client_pos_version = 14;</code>
     * @return this
     */
    public RotateMapScRsp clearClientPosVersion() {
      bitField0_ &= ~0x00000002;
      clientPosVersion = 0;
      return this;
    }

    /**
     * <code>optional uint32 client_pos_version = 14;</code>
     * @return the clientPosVersion
     */
    public int getClientPosVersion() {
      return clientPosVersion;
    }

    /**
     * <code>optional uint32 client_pos_version = 14;</code>
     * @param value the clientPosVersion to set
     * @return this
     */
    public RotateMapScRsp setClientPosVersion(final int value) {
      bitField0_ |= 0x00000002;
      clientPosVersion = value;
      return this;
    }

    /**
     * <code>optional .MotionInfo motion = 5;</code>
     * @return whether the motion field is set
     */
    public boolean hasMotion() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .MotionInfo motion = 5;</code>
     * @return this
     */
    public RotateMapScRsp clearMotion() {
      bitField0_ &= ~0x00000004;
      motion.clear();
      return this;
    }

    /**
     * <code>optional .MotionInfo motion = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMotion()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public MotionInfoOuterClass.MotionInfo getMotion() {
      return motion;
    }

    /**
     * <code>optional .MotionInfo motion = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public MotionInfoOuterClass.MotionInfo getMutableMotion() {
      bitField0_ |= 0x00000004;
      return motion;
    }

    /**
     * <code>optional .MotionInfo motion = 5;</code>
     * @param value the motion to set
     * @return this
     */
    public RotateMapScRsp setMotion(final MotionInfoOuterClass.MotionInfo value) {
      bitField0_ |= 0x00000004;
      motion.copyFrom(value);
      return this;
    }

    @Override
    public RotateMapScRsp copyFrom(final RotateMapScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        clientPosVersion = other.clientPosVersion;
        motion.copyFrom(other.motion);
      }
      return this;
    }

    @Override
    public RotateMapScRsp mergeFrom(final RotateMapScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasClientPosVersion()) {
        setClientPosVersion(other.clientPosVersion);
      }
      if (other.hasMotion()) {
        getMutableMotion().mergeFrom(other.motion);
      }
      return this;
    }

    @Override
    public RotateMapScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      clientPosVersion = 0;
      motion.clear();
      return this;
    }

    @Override
    public RotateMapScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      motion.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RotateMapScRsp)) {
        return false;
      }
      RotateMapScRsp other = (RotateMapScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasClientPosVersion() || clientPosVersion == other.clientPosVersion)
        && (!hasMotion() || motion.equals(other.motion));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(clientPosVersion);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 42);
        output.writeMessageNoTag(motion);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(clientPosVersion);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(motion);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RotateMapScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // clientPosVersion
            clientPosVersion = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // motion
            input.readMessage(motion);
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.clientPosVersion, clientPosVersion);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.motion, motion);
      }
      output.endObject();
    }

    @Override
    public RotateMapScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1787644431:
          case 1278860153: {
            if (input.isAtField(FieldNames.clientPosVersion)) {
              if (!input.trySkipNullValue()) {
                clientPosVersion = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1068318794: {
            if (input.isAtField(FieldNames.motion)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(motion);
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
    public RotateMapScRsp clone() {
      return new RotateMapScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RotateMapScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RotateMapScRsp(), data).checkInitialized();
    }

    public static RotateMapScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RotateMapScRsp(), input).checkInitialized();
    }

    public static RotateMapScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RotateMapScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating RotateMapScRsp messages
     */
    public static MessageFactory<RotateMapScRsp> getFactory() {
      return RotateMapScRspFactory.INSTANCE;
    }

    private enum RotateMapScRspFactory implements MessageFactory<RotateMapScRsp> {
      INSTANCE;

      @Override
      public RotateMapScRsp create() {
        return RotateMapScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName clientPosVersion = FieldName.forField("clientPosVersion", "client_pos_version");

      static final FieldName motion = FieldName.forField("motion");
    }
  }
}
