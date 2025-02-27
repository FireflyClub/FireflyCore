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
import us.hebi.quickbuf.RepeatedMessage;

public final class GetEnteredSceneScRspOuterClass {
  /**
   * Protobuf type {@code GetEnteredSceneScRsp}
   */
  public static final class GetEnteredSceneScRsp extends ProtoMessage<GetEnteredSceneScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 4;</code>
     */
    private int retcode;

    /**
     * <code>repeated .EnteredSceneInfo entered_scene_info = 14;</code>
     */
    private final RepeatedMessage<EnteredSceneInfoOuterClass.EnteredSceneInfo> enteredSceneInfo = RepeatedMessage.newEmptyInstance(EnteredSceneInfoOuterClass.EnteredSceneInfo.getFactory());

    private GetEnteredSceneScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetEnteredSceneScRsp}
     */
    public static GetEnteredSceneScRsp newInstance() {
      return new GetEnteredSceneScRsp();
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return this
     */
    public GetEnteredSceneScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetEnteredSceneScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .EnteredSceneInfo entered_scene_info = 14;</code>
     * @return whether the enteredSceneInfo field is set
     */
    public boolean hasEnteredSceneInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .EnteredSceneInfo entered_scene_info = 14;</code>
     * @return this
     */
    public GetEnteredSceneScRsp clearEnteredSceneInfo() {
      bitField0_ &= ~0x00000002;
      enteredSceneInfo.clear();
      return this;
    }

    /**
     * <code>repeated .EnteredSceneInfo entered_scene_info = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEnteredSceneInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<EnteredSceneInfoOuterClass.EnteredSceneInfo> getEnteredSceneInfo() {
      return enteredSceneInfo;
    }

    /**
     * <code>repeated .EnteredSceneInfo entered_scene_info = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<EnteredSceneInfoOuterClass.EnteredSceneInfo> getMutableEnteredSceneInfo(
        ) {
      bitField0_ |= 0x00000002;
      return enteredSceneInfo;
    }

    /**
     * <code>repeated .EnteredSceneInfo entered_scene_info = 14;</code>
     * @param value the enteredSceneInfo to add
     * @return this
     */
    public GetEnteredSceneScRsp addEnteredSceneInfo(
        final EnteredSceneInfoOuterClass.EnteredSceneInfo value) {
      bitField0_ |= 0x00000002;
      enteredSceneInfo.add(value);
      return this;
    }

    /**
     * <code>repeated .EnteredSceneInfo entered_scene_info = 14;</code>
     * @param values the enteredSceneInfo to add
     * @return this
     */
    public GetEnteredSceneScRsp addAllEnteredSceneInfo(
        final EnteredSceneInfoOuterClass.EnteredSceneInfo... values) {
      bitField0_ |= 0x00000002;
      enteredSceneInfo.addAll(values);
      return this;
    }

    @Override
    public GetEnteredSceneScRsp copyFrom(final GetEnteredSceneScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        enteredSceneInfo.copyFrom(other.enteredSceneInfo);
      }
      return this;
    }

    @Override
    public GetEnteredSceneScRsp mergeFrom(final GetEnteredSceneScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasEnteredSceneInfo()) {
        getMutableEnteredSceneInfo().addAll(other.enteredSceneInfo);
      }
      return this;
    }

    @Override
    public GetEnteredSceneScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      enteredSceneInfo.clear();
      return this;
    }

    @Override
    public GetEnteredSceneScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      enteredSceneInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetEnteredSceneScRsp)) {
        return false;
      }
      GetEnteredSceneScRsp other = (GetEnteredSceneScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasEnteredSceneInfo() || enteredSceneInfo.equals(other.enteredSceneInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < enteredSceneInfo.length(); i++) {
          output.writeRawByte((byte) 114);
          output.writeMessageNoTag(enteredSceneInfo.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * enteredSceneInfo.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(enteredSceneInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetEnteredSceneScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // enteredSceneInfo
            tag = input.readRepeatedMessage(enteredSceneInfo, tag);
            bitField0_ |= 0x00000002;
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
        output.writeRepeatedMessage(FieldNames.enteredSceneInfo, enteredSceneInfo);
      }
      output.endObject();
    }

    @Override
    public GetEnteredSceneScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -2087951453:
          case 1290523721: {
            if (input.isAtField(FieldNames.enteredSceneInfo)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(enteredSceneInfo);
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
    public GetEnteredSceneScRsp clone() {
      return new GetEnteredSceneScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetEnteredSceneScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetEnteredSceneScRsp(), data).checkInitialized();
    }

    public static GetEnteredSceneScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetEnteredSceneScRsp(), input).checkInitialized();
    }

    public static GetEnteredSceneScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetEnteredSceneScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetEnteredSceneScRsp messages
     */
    public static MessageFactory<GetEnteredSceneScRsp> getFactory() {
      return GetEnteredSceneScRspFactory.INSTANCE;
    }

    private enum GetEnteredSceneScRspFactory implements MessageFactory<GetEnteredSceneScRsp> {
      INSTANCE;

      @Override
      public GetEnteredSceneScRsp create() {
        return GetEnteredSceneScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName enteredSceneInfo = FieldName.forField("enteredSceneInfo", "entered_scene_info");
    }
  }
}
